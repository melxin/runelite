public class RuneLiteObject extends Renderable {
	public Model model;

	public boolean loop;

	private int orientation;
	private int radius = 60;
	private boolean drawFrontTilesFirst;

	private boolean isFinished;

	int frame;
	int frameCycle;

	public RuneLiteObject() {
		this.isFinished = true;
	}

	public boolean isLooping() {
		return loop;
	}

	public boolean isActive() {
		return !this.isFinished;
	}

	public void setActive(boolean active) {
		if (this.isFinished == active) {
			this.isFinished = !active;
			if (active) {
				this.frame = 0;
				this.frameCycle = 0;
				class32.worldView.graphicsObjects.addFirst(this);
			} else {
				remove();
			}
		}
	}

	public void setShouldLoop(boolean var1) {
		this.loop = var1;
	}

	public void setModel(Model var1) {
		this.model = var1;
	}

	public void setOrientation(int orientation) {
		this.orientation = orientation;
	}

	public int getOrientation() {
		return orientation;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setDrawFrontTilesFirst(boolean drawFrontTilesFirst) {
		this.drawFrontTilesFirst = drawFrontTilesFirst;
	}

	public boolean drawFrontTilesFirst() {
		return drawFrontTilesFirst;
	}
}