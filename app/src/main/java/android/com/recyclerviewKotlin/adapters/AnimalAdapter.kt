package android.com.recyclerviewKotlin.adapters


import android.com.fastadaptertest.R
import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.animal_list_item.view.*

class AnimalAdapter(val items: ArrayList<String>, val context: Context) : RecyclerView.Adapter<ViewHolder>() {


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        holder.tvAnimalType?.text = items.get(position)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.animal_list_item, parent, false))
    }


    override fun getItemCount(): Int {
        return items.size
    }


}

class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

//    val tvAnimalType = view.tv_animal_type
}