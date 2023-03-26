package infinituum.chesttagger.items;

import infinituum.chesttagger.screens.LabellingMachineScreenFactory;
import infinituum.chesttagger.utils.TaggableChest;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class LabellingMachineItem extends Item {
    public LabellingMachineItem(Settings settings) {
        super(settings);
    }

    private String getLabel(ItemStack itemStack) {
        NbtCompound labelNbt = itemStack.getSubNbt("Label");
        return (labelNbt != null) ? labelNbt.getString("text") : "";
    }

    private Item getDisplayItem(ItemStack itemStack) {
        NbtCompound displayItemNbt = itemStack.getSubNbt("Contents");
        return (displayItemNbt != null) ? ItemStack.fromNbt(displayItemNbt).getItem() : ItemStack.EMPTY.getItem();
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        BlockPos pos = context.getBlockPos();
        World world = context.getWorld();
        BlockState state = world.getBlockState(pos);
        Block block = state.getBlock();
        ItemStack itemStack = context.getStack();

        if(block == Blocks.CHEST && world.getBlockEntity(pos) instanceof TaggableChest taggableChest) {
            taggableChest.setLabel(Text.literal(getLabel(itemStack)));
            taggableChest.setDisplayItem(getDisplayItem(itemStack));

            return ActionResult.SUCCESS;
        }

        return super.useOnBlock(context);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if(!world.isClient()) {
            user.openHandledScreen(new LabellingMachineScreenFactory());
        }

        return super.use(world, user, hand);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        String currentLabel = getLabel(stack);
        Item currentDisplayItem = getDisplayItem(stack);

        tooltip.add(Text.translatable("item.chesttagger.labelling_machine.tooltip.label").formatted(Formatting.GRAY)
                .append(Text.literal(currentLabel.equals("") ? "none" : "\"" + currentLabel + "\"")
                        .formatted(currentLabel.equals("") ? Formatting.RED : Formatting.GREEN)));
        tooltip.add(Text.translatable("item.chesttagger.labelling_machine.tooltip.display_item").formatted(Formatting.GRAY)
                .append(Text.literal(currentDisplayItem.equals(Items.AIR) ? "none" : currentDisplayItem.toString())
                        .formatted(currentDisplayItem.equals(Items.AIR) ? Formatting.RED : Formatting.GREEN)));
        super.appendTooltip(stack, world, tooltip, context);
    }
}
