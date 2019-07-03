package space.fstudio.quicksettingstile;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.service.quicksettings.Tile;
import android.service.quicksettings.TileService;
import android.support.annotation.RequiresApi;

@SuppressLint("Registered")
@RequiresApi(api = Build.VERSION_CODES.N)
public class CreditsTileService extends TileService {

    Tile tile;

    @Override
    public IBinder onBind(Intent intent) {
        return super.onBind(intent);
    }

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
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/syorito-hatsuki/QuickSettingsTile"));
        startActivity(intent);
    }
}
