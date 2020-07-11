package pk.edu.pucit.mcproject;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;


public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {
    private Context context;
    private List<CategoryModel> categoryModelList;

    public CategoryAdapter(Context context, List<CategoryModel> categoryModelList) {
        this.context = context;
        this.categoryModelList = categoryModelList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View row = LayoutInflater.from(context).inflate(R.layout.category_item, null);
        return new ViewHolder(row);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        String url=categoryModelList.get(position).getImageUrl();
        Picasso.with(context).load(categoryModelList.get(position).getImageUrl()).into(holder.imageView);
        holder.title.setText(categoryModelList.get(position).getTitle());
        int i=categoryModelList.get(position).getId();
        holder.title.setHint(categoryModelList.get(position).getId()+"");
        holder.title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv=(TextView)v;
                String s= (String) tv.getHint();
                Intent intent = new Intent(context, Questions.class);
                intent.putExtra("CategoryId", s);
                context.startActivity(intent);
            }
        });
        Log.e("title at pos "+position, categoryModelList.get(position).getTitle() );
       // holder.setData(categoryModelList.get(position).getImageUrl(),categoryModelList.get(position).getTitle());

    }

    @Override
    public int getItemCount() {
        return categoryModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
       public ImageView imageView;
        public TextView title;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.image_view);
            title=itemView.findViewById(R.id.title);

        }

    }
}
