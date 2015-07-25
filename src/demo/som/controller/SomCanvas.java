package demo.som.controller;

import myutils.debug.Debug;
import myutils.gui.IterativeCanvas;
import myutils.gui.Pixels;

import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

/**
 * Created by beenotung on 7/19/15.
 */
public class SomCanvas extends IterativeCanvas {
    public SomCanvas() {
        this(1);
    }

    public SomCanvas(int scale) {
        this(0.8, 0.8, scale);
    }

    public SomCanvas(double widthRate, double heightRate, int scale) {
//        super(widthRate, heightRate, scale);
        SCALE = scale;
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
                onResize(getWidth(), getHeight());
            }
        });
    }

    public void onResize(int width, int height) {
        logd("resize");
        WIDTH = width / SCALE;
        HEIGHT = height / SCALE;
        cx = WIDTH / 2f;
        cy = HEIGHT / 2f;
        setMinimumSize(new Dimension(WIDTH * SCALE / 2, HEIGHT * SCALE / 2));
        setPreferredSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
        setMaximumSize(new Dimension(WIDTH * SCALE * 2, HEIGHT * SCALE * 2));
        image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
        screen = new Pixels(((DataBufferInt) image.getRaster().getDataBuffer()).getData(), this);
        createBufferStrategy(3);
        bufferStrategy = getBufferStrategy();
        graphics = bufferStrategy.getDrawGraphics();
    }

    @Override
    protected void init() {

    }

    @Override
    protected void myTick() {

    }

    @Override
    protected void myRender() {

    }

    @Override
    protected void myDebugInfo() {

    }

    @Override
    protected void myKeyHandling() {

    }

    @Override
    protected void myMouseHandling() {

    }

    private void logd(Object o) {
        Debug.logd(getClass().getSimpleName(), o);
    }

}
