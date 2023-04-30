package net.hectus.hectusclient.guis;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.LiteralTextContent;
import net.minecraft.text.Text;

import java.awt.*;

public class ClientMenu extends Screen {
    public String CLIENT_MENU_BUTTON = "hectusclient.client_menu.gui.button";
    private Button myButton;
    private TextField myTextField;

    public ClientMenu() {
        super(new TranslatableText("my_mod.gui.title"));
    }

    @Override
    protected void init() {
        // Create and position GUI elements
        myButton = new Button(10, 10, 100, 20, new TranslatableText("my_mod.gui.button"), (button) -> {
            // Handle button click event
        });
        myTextField = new TextField("test", 1);

        // Add elements to the screen
        this.addDrawableChild(myButton);
        this.addSelectableChild(myTextField);
    }

    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        // Draw GUI elements
        this.renderBackground(matrices);
        super.render(matrices, mouseX, mouseY, delta);
    }

    @Override
    public boolean mouseClicked(double mouseX, double mouseY, int button) {
        // Handle mouse click event
        return super.mouseClicked(mouseX, mouseY, button);
    }

    @Override
    public boolean charTyped(char chr, int keyCode) {
        // Handle keyboard input event
        return super.charTyped(chr, keyCode);
    }
}
