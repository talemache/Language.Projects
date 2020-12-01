import java.awt.Graphics;

@Deprecated
class HelloWorldAppet extends java.applet.Applet{
   
    /**
     * @deprecated
     */
    private static final long serialVersionUID = 1771714638563920791L;

    @Override
    public void paint(Graphics g) {
        g.drawString("Hello World!", 5, 25);
    }
}