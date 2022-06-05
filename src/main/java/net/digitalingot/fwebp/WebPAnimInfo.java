package net.digitalingot.fwebp;

public final class WebPAnimInfo {
    private int canvasWidth;
    private int canvasHeight;
    private int loopCount;
    private int backgroundColor;
    private int frameCount;

    private WebPAnimInfo() {
    }

    public int getCanvasWidth() {
        return this.canvasWidth;
    }

    public int getCanvasHeight() {
        return this.canvasHeight;
    }

    public int getLoopCount() {
        return this.loopCount;
    }

    public int getBackgroundColor() {
        return this.backgroundColor;
    }

    public int getFrameCount() {
        return this.frameCount;
    }
}
