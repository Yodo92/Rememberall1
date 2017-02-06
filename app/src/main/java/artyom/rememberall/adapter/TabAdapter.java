package artyom.rememberall.adapter;
import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentStatePagerAdapter;
import artyom.rememberall.fragment.CurrentTaskFragment;
import artyom.rememberall.fragment.DoneTaskFragment;

/**
 * Created by Администратор on 05.02.2017.
 */

public class TabAdapter extends FragmentStatePagerAdapter {


    private int numberOfTabs;

    public TabAdapter(FragmentManager fm, int numberOfTabs) {
        super(fm);
        this.numberOfTabs = numberOfTabs;
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {

            case 0:
            return new CurrentTaskFragment();
            case 1:
                return new DoneTaskFragment();
            default:
                return null;
        }


    }

    @Override
    public int getCount() {
        return numberOfTabs;
    }
}
