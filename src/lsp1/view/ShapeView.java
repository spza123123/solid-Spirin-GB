package lsp1.view;

import lsp1.shape.Quadroiteral;
import lsp1.shape.Rectangle;

public class ShapeView {
    private final Quadroiteral quadroiteral;

    public ShapeView(Quadroiteral quadroiteral) {
        this.quadroiteral = quadroiteral;
    }

    public void showArea() {
        System.out.print("Area of rectangle equal:");
        System.out.println(quadroiteral.getArea());
    }
}
