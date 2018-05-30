package com.example.hw6;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<News> news;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        RecyclerView newsRecyclerView = findViewById(R.id.news_recycler_view);
        newsRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        newsRecyclerView.setAdapter(new NewsAdapter(this, news));
    }

    private void init() {
        news = new ArrayList<>();

        News news1 = new News();
        news1.setPhoto(R.drawable.potok_mashin1);
        news1.setTitle("Автомобилистам на заметкам: вступают в силу новые правила МВД РК");
        news1.setBody("С 26 мая 2018 года вступают в силу изменения и дополнения в приказ МВД от 2 декабря 2014 года №862 «Об утверждении Правил государственной регистрации и учета отдельных видов транспортных средств по идентификационному номеру транспортного средства, подготовки водителей механических транспортных средств, приема экзаменов и выдачи водительских удостоверений», а также в приказ МВД от 14 апреля 2015 года № 341 «Об утверждении стандартов государственных услуг в сфере обеспечения безопасности дорожного движения». Об этом на своей странице в Facebook заявил Комитет административной полиции МВД РК.");

        News news2 = new News();
        news2.setPhoto(R.drawable.car2);
        news2.setTitle("В России появился новый кроссовер Toyota (он дешевле, чем RAV4)");
        news2.setBody("Пока информации немного. Известно, что клиентам предложат 3 комплектации, «отличающихся как оснащением, так и силовыми агрегатами, типом коробки передач (6-ступенчатая механика или вариатор) и типом привода (передний или полный)». Двигатели на выбор — 1,2-литровый турбомотор (115 л. с.) или двухлитровый атмосферник (148 л.с.).");

        News news3 = new News();
        news3.setPhoto(R.drawable.number3);
        news3.setTitle("Сверку при перерегистрации авто в Казахстане отменят");
        news3.setBody("Приказ о внесении изменений и дополнений в приказ министра внутренних дел Республики Казахстан от 14 апреля 2015 года № 341 «Об утверждении стандартов государственных услуг в сфере обеспечения безопасности дорожного движения» официально опубликовали 15 мая 2018 года. Изменения вступят в силу после 25 мая 2018 года.");


        news.add(news1);
        news.add(news2);
        news.add(news3);
    }
}
