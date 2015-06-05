package us.cordeau.portfoliospringboard;

import android.app.Activity;
import android.content.res.Resources;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.content.Context;


public class PortfolioSpringboard extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio_springboard);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_portfolio_springboard, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    //Launches the Spotify Streamer app
    public void launchSpotify(View view)
    {
        showToast(R.string.streamer_title);
    }

    //Launches the Scores app
    public void launchScores(View view)
    {
        showToast(R.string.scores_title);
    }

    //Launches the Library app
    public void launchLibrary(View view)
    {
        showToast(R.string.library_title);
    }

    //Launches the Build It Bigger app
    public void launchBuildit(View view)
    {
        showToast(R.string.buildit_title);
    }

    //Launches the XYZ Reader app
    public void launchReader(View view)
    {
        showToast(R.string.xyz_title);
    }

    //Launches the Capstone app
    public void launchCapstone(View view)
    {
        showToast(R.string.capstone_title);
    }

    private void showToast(int id)
    {
        Context context = getApplicationContext();
        Resources res = getResources();
        String text = res.getString(R.string.toast_generic);
        String app_title = res.getString(id);
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, String.format(text, app_title), duration);
        toast.show();
    }
}
