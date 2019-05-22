package space.fstudio.quicksettingstile.Services;

import android.graphics.drawable.Icon;
import android.os.Build.VERSION_CODES;
import android.service.quicksettings.Tile;
import android.service.quicksettings.TileService;
import android.support.annotation.RequiresApi;
import space.fstudio.quicksettingstile.R;

@RequiresApi(api = VERSION_CODES.N)
public class MyTileService extends TileService {

  Tile tile;

  @Override
  public void onTileAdded() {
    super.onTileAdded();
    tile = this.getQsTile();
    tile.setState(Tile.STATE_INACTIVE);
    tile.updateTile();
  }

  @Override
  public void onTileRemoved() {
    super.onTileRemoved();
  }

  @Override
  public void onStartListening() {
    super.onStartListening();

  }

  @Override
  public void onStopListening() {
    super.onStopListening();
  }

  @Override
  public void onClick() {
    super.onClick();
    tile = this.getQsTile();
    switch (tile.getState()) {
      case Tile.STATE_ACTIVE:
        tile.setState(Tile.STATE_INACTIVE);
        tile.setLabel("OFF");
        break;
      case Tile.STATE_INACTIVE:
        tile.setState(Tile.STATE_ACTIVE);
        tile.setLabel("ON");
        break;
    }
    tile.updateTile();
  }
}
