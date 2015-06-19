package idv.johnwang.ex2_1;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.RelativeLayout;


public class MainActivity extends ActionBarActivity {
    private RelativeLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }
    
    public void findViews() {
        layout = (RelativeLayout)findViewById(R.id.relativelayout);
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        SubMenu smImage = menu.addSubMenu(0, R.id.bgImage, 0, R.string.change_background_image);
        smImage.add(0, R.id.imageA, 1, R.string.imageA);
        smImage.add(0, R.id.imageB, 2, R.string.imageB);
        smImage.add(0, R.id.imageC, 3, R.string.imageC);
        
        SubMenu smColor = menu.addSubMenu(1, R.id.bgColor, 0, R.string.change_background_color);
        smColor.add(1, R.id.yellow, 1, R.string.yellow);
        smColor.add(1, R.id.red, 2, R.string.red);
        smColor.add(1, R.id.blue, 3, R.string.blue);
        
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.imageA:
                layout.setBackgroundResource(R.drawable.a);
                break;
            case R.id.imageB:
                layout.setBackgroundResource(R.drawable.b);
                break;
            case R.id.imageC:
                layout.setBackgroundResource(R.drawable.c);
                break;
            
            case R.id.yellow:
                layout.setBackgroundColor(Color.YELLOW);
                break;
            case R.id.red:
                layout.setBackgroundColor(Color.RED);
                break;
            case R.id.blue:
                layout.setBackgroundColor(Color.BLUE);
                break;
            
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }
}
