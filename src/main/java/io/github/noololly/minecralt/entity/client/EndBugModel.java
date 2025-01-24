package io.github.noololly.minecralt.entity.client;

import io.github.noololly.minecralt.Minecralt;
import io.github.noololly.minecralt.entity.custom.EndBugEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class EndBugModel<T extends EndBugEntity> extends Model.SinglePartModel<> {

    private final ModelPart end_bug;

    public static final EntityModelLayer END_BUG = new EntityModelLayer(Identifier.of(Minecralt.MOD_ID, "end_bug"), "main");

    public EndBugModel(ModelPart root) {
        this.end_bug = root.getChild("end_bug");
        ModelPart legs = this.end_bug.getChild("Legs");
        ModelPart head = this.end_bug.getChild("Head");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData end_bug = modelPartData.addChild("end_bug", ModelPartBuilder.create(), ModelTransform.pivot(-4.0F, 20.0F, 0.0F));

        ModelPartData Body = end_bug.addChild("Body", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -2.0F, -7.0F, 8.0F, 4.0F, 15.0F, new Dilation(0.0F)), ModelTransform.pivot(4.0F, -2.0F, 6.0F));

        ModelPartData Legs = end_bug.addChild("Legs", ModelPartBuilder.create(), ModelTransform.pivot(4.0F, 4.0F, 0.0F));

        ModelPartData LegLFTfrnt = Legs.addChild("LegLFTfrnt", ModelPartBuilder.create().uv(0, 27).cuboid(0.0F, -2.0F, 0.0F, 0.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(4.0F, -4.0F, 0.0F));

        ModelPartData LegLFTfrnt2 = Legs.addChild("LegLFTfrnt2", ModelPartBuilder.create().uv(12, 27).cuboid(0.0F, -2.0F, 0.0F, 0.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-4.0F, -4.0F, 0.0F));

        ModelPartData LegLFTmid = Legs.addChild("LegLFTmid", ModelPartBuilder.create().uv(8, 27).cuboid(-8.0F, -2.0F, 0.0F, 0.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(4.0F, -4.0F, 5.0F));

        ModelPartData LegLFTmid2 = Legs.addChild("LegLFTmid2", ModelPartBuilder.create().uv(16, 27).cuboid(8.0F, -2.0F, 0.0F, 0.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-4.0F, -4.0F, 5.0F));

        ModelPartData LegLFTbck = Legs.addChild("LegLFTbck", ModelPartBuilder.create().uv(4, 27).cuboid(0.0F, -2.0F, 0.0F, 0.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(4.0F, -4.0F, 10.0F));

        ModelPartData LegLFTbck2 = Legs.addChild("LegLFTbck2", ModelPartBuilder.create().uv(20, 27).cuboid(0.0F, -2.0F, -1.0F, 0.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-4.0F, -4.0F, 11.0F));

        ModelPartData LeftLegs = Legs.addChild("LeftLegs", ModelPartBuilder.create(), ModelTransform.pivot(4.0F, -4.0F, 0.0F));

        ModelPartData Head = end_bug.addChild("Head", ModelPartBuilder.create().uv(0, 19).cuboid(-4.0F, -2.0F, -2.0F, 8.0F, 4.0F, 4.0F, new Dilation(0.0F))
                .uv(25, 19).cuboid(-4.0F, 1.0F, -9.0F, 8.0F, 0.0F, 7.0F, new Dilation(0.0F)), ModelTransform.pivot(4.0F, -2.0F, -3.0F));

        ModelPartData cube_r1 = Head.addChild("cube_r1", ModelPartBuilder.create().uv(24, 24).cuboid(-1.0F, -3.0F, -1.0F, 4.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(4.0F, -4.0F, -1.0F, 0.0F, 1.5708F, 0.0F));

        ModelPartData cube_r2 = Head.addChild("cube_r2", ModelPartBuilder.create().uv(24, 19).cuboid(-1.0F, -3.0F, -1.0F, 4.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -4.0F, -1.0F, 0.0F, 1.5708F, 0.0F));
        return TexturedModelData.of(modelData, 64, 64);
    }
    @Override
    public void setAngles(EndBugEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int color) {
        end_bug.render(matrices, vertexConsumer, light, overlay, color);
    }
    @Override
    public ModelPart getPart() {
        return end_bug;
    }

}