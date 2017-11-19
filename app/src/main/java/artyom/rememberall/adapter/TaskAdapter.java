package artyom.rememberall.adapter;

import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import artyom.rememberall.fragment.TaskFragment;
import artyom.rememberall.model.Item;

/**
 * Created by Администратор on 08.02.2017.
 */

public abstract class TaskAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
List<Item> items;
    TaskFragment taskFragment;
    public TaskAdapter(TaskFragment taskFragment) {

        this.taskFragment = taskFragment;
        items = new ArrayList<>();
    }

    public Item getItem(int position) {

        return items.get(position);

    }

    public void addItem(Item item) {
        items.add(item);
        notifyItemInserted(getItemCount() - 1);
    }

    public void addItem(int location, Item item) {
        items.add(location, item);
        notifyItemInserted(location);
    }

    public void removeItem(int location) {
        if (location >= 0 &&)
    }

}
