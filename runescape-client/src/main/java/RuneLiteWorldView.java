import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RuneLiteWorldView {
	public final WorldView worldView;

	public RuneLiteWorldView(WorldView worldView) {
		this.worldView = worldView;
	}

	public Object byIndex(int idx) {
		return getWorldView(idx);
	}

	public WorldView getWorldView(int idx) {
		WorldEntity worldEntity = (WorldEntity) this.worldView.worldEntities.get(idx);
		return worldEntity == null ? null : worldEntity.worldView;
	}

	/*public Iterator iterator() {
		return Iterators.transform(this.dg.ar.iterator(), (var0) -> {
			return var0.aa;
		});
	}*/
	public Iterator iterator()
	{
		final List<WorldView> worldViews = new ArrayList<>();
		for (Iterator iter = worldView.worldEntities.iterator(); iter.hasNext(); )
		{
			final WorldEntity worldEntity = (WorldEntity) iter.next();
			worldViews.add(worldEntity.worldView);
		}
		return worldViews.iterator();
	}
}