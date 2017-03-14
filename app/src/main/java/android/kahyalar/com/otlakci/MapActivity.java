package android.kahyalar.com.otlakci;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * Created by kahyalar on 14/03/2017.
 */

public class MapActivity extends AppCompatActivity implements OnMapReadyCallback{
    private GoogleMap map;
    private LatLng myLocation = new LatLng(41.041876, 29.009169);
    private LatLng serverLocation = new LatLng(41.045619, 29.010703);

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        SupportMapFragment smf = (SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.mapFragment);
        smf.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map = googleMap;
        map.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        MarkerOptions markerOptionsForUser = new MarkerOptions()
                .title("Siz")
                .snippet("@kahyalar")
                .position(myLocation);

        MarkerOptions markerOptionsForServer = new MarkerOptions()
                .title("Leyla Bozkurt")
                .snippet("@leylabozkurt")
                .position(serverLocation);

        map.addMarker(markerOptionsForUser);
        Marker markerServer = map.addMarker(markerOptionsForServer);
        markerServer.setIcon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(myLocation, 17));
    }
}
