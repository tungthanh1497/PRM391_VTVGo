package com.vedz.tungthanh1497.tungtt_se04896_vtvgo.adapters;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.vedz.tungthanh1497.tungtt_se04896_vtvgo.MainActivity;
import com.vedz.tungthanh1497.tungtt_se04896_vtvgo.R;
import com.vedz.tungthanh1497.tungtt_se04896_vtvgo.models.NewsModel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy 'at' HH:mm:ss");
    List<NewsModel> newsList = new ArrayList<>();

    public RecyclerAdapter() {
        try {
            newsList.add(new NewsModel(R.drawable.ipxs, R.drawable.ava, "Dọn đường đón iPhone XS chính hãng, hàng loạt iPhone đời cũ giảm giá", dateFormat.parse("08/10/2018 at 11:35:00"), 88, 14, "Mới đây, các nhà bán lẻ chính hãng iPhone đã đưa ra thông tin giảm giá 3 triệu đồng đối với iPhone X, iPhone 8, 8 Plus và giảm 2 triệu đồng đối với iPhone 7, 7 Plus và 6S Plus trước khi thế hệ iPhone mới chính thức về Việt Nam", "https://www.techz.vn/don-duong-don-iphone-xs-chinh-hang-hang-loat-iphone-doi-cu-giam-gia-ylt69469.html"));
            newsList.add(new NewsModel(R.drawable.bp3, R.drawable.ava, "Link xem trực tiếp lễ ra mắt Bphone 3", dateFormat.parse("08/10/2018 at 15:25:00"), 60, 37, "Bkav đã gửi thư mời tham dự sự kiện ra mắt Bphone 3 ở Trung tâm Hội nghị Quốc gia sắp tới; ai không có điều kiện đến tham dự có thể xem trực tiếp sự kiện trên mạng", "https://www.techz.vn/link-xem-truc-tiep-le-ra-mat-bphone-3-ylt69482.html"));
            newsList.add(new NewsModel(R.drawable.nova3i, R.drawable.ava, "Huawei Nova 3i là minh chứng rõ rệt nhất cho thấy màu trắng chưa bao giờ nhàm chán trên smartphone", dateFormat.parse("08/10/2018 at 15:00:00"), 97, 50, "Màu trắng tưởng như là màu cơ bản nhàm chán nhưng với màu trắng ngọc trai trên Huawei Nova 3i càng nhìn càng thấy đẹp tới không tưởng", "https://www.techz.vn/huawei-nova-3i-la-minh-chung-ro-ret-nhat-cho-thay-mau-trang-chua-bao-gio-nham-chan-tren-smartphone-ylt69480.html"));
            newsList.add(new NewsModel(R.drawable.pixel3, R.drawable.ava, "Pixel 3 và Pixel 3 XL lộ tùy chọn màu hồng bánh bèo", dateFormat.parse("08/10/2018 at 10:31:00"), 21, 17, "Theo nhiều hình ảnh rò rỉ mới nhất, cặp Pixel 3 năm nay vẫn cố thủ với camera sau đơn.", "https://www.techz.vn/pixel-3-va-pixel-3-xl-lo-tuy-chon-mau-hong-banh-beo-ylt69464.html"));
            newsList.add(new NewsModel(R.drawable.galaxys10, R.drawable.ava, "Galaxy S10 có thể đi kèm chip xử lý AI chuyên dụng", dateFormat.parse("08/10/2018 at 09:50:00"), 88, 60, "Cuộc đua smartphone tích hợp chip AI chuyên dụng sẽ trở nên hấp dẫn hơn sau khi có sự xuất hiện của công ty Hàn Quốc.", "https://www.techz.vn/galaxy-s10-co-the-di-kem-chip-xu-ly-ai-chuyen-dung-ylt69463.html"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())

                .inflate(R.layout.item_card_layout, parent, false);

        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.itemCover.setImageResource(newsList.get(position).getImgCover());
        holder.itemAvatar.setImageResource(newsList.get(position).getImgAvatar());
        holder.itemTitle.setText(newsList.get(position).getTitle());
        holder.itemTime.setText(calculateDateAgo(newsList.get(position).getDatePublished()));
        holder.itemPlayed.setText(newsList.get(position).getPlayed()+"");
        holder.itemLiked.setText(newsList.get(position).getLiked()+"");
        holder.itemDetail.setText(newsList.get(position).getDetail());
    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView itemCover;
        public ImageView itemAvatar;
        public TextView itemTitle;
        public TextView itemTime;
        public TextView itemPlayed;
        public TextView itemLiked;
        public TextView itemDetail;

        public ViewHolder(View itemView) {
            super(itemView);
            itemCover = (ImageView) itemView.findViewById(R.id.item_cover);
            itemAvatar = (ImageView) itemView.findViewById(R.id.item_avatar);
            itemTitle = (TextView) itemView.findViewById(R.id.item_title);
            itemTime = (TextView) itemView.findViewById(R.id.item_time);
            itemPlayed = (TextView) itemView.findViewById(R.id.item_played);
            itemLiked = (TextView) itemView.findViewById(R.id.item_liked);
            itemDetail = (TextView) itemView.findViewById(R.id.item_detail);

            itemView.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                int position = getAdapterPosition();
                                                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(newsList.get(position).getUrlDirect()));
                                                MainActivity.getContext().startActivity(intent);
                                            }
                                        }
            );
        }

    }

    private String calculateDateAgo(Date date) {
        String processedDate = "";
        Date now = new Date();
        long seconds = TimeUnit.MILLISECONDS.toSeconds(now.getTime() - date.getTime());
        long minutes = TimeUnit.MILLISECONDS.toMinutes(now.getTime() - date.getTime());
        long hours = TimeUnit.MILLISECONDS.toHours(now.getTime() - date.getTime());
        long days = TimeUnit.MILLISECONDS.toDays(now.getTime() - date.getTime());
        if (seconds < 60) {
            processedDate = seconds + " seconds ago";
        } else if (minutes < 60) {
            processedDate = minutes + " minutes ago";
        } else if (hours < 24) {
            processedDate = hours + " hours ago";
        } else {
            processedDate = days + " days ago";
        }
        return processedDate;
    }
}
