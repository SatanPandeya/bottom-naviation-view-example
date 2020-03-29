package www.bottomnavigationview;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class BottomNavigationViewActivity extends AppCompatActivity {

    private TextView toolbarTitle;
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation_view);
        initView();
        toolbarTitle.setText(R.string.phone);
        initBottomSheet();
    }

    private void initBottomSheet() {
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.phoneId:
                        toolbarTitle.setText(R.string.phone);
                        Toast.makeText(BottomNavigationViewActivity.this, "Phone sheet selected", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.cameraId:
                        toolbarTitle.setText(R.string.camera);
                        Toast.makeText(BottomNavigationViewActivity.this, "Camera sheet selected", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.messageId:
                        toolbarTitle.setText(R.string.message);
                        Toast.makeText(BottomNavigationViewActivity.this, "Message sheet selected", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.albumsId:
                        toolbarTitle.setText(R.string.albums);
                        Toast.makeText(BottomNavigationViewActivity.this, "Albums sheet selected", Toast.LENGTH_SHORT).show();
                        break;

                }
                return true;
            }
        });
    }

    private void initView() {
        toolbarTitle = findViewById(R.id.toolbarTextId);
        bottomNavigationView = findViewById(R.id.bottomSheetNavId);
    }
}
