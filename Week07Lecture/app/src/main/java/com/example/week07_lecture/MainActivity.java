package com.example.week07_lecture;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<MathTopic> topics;
    RecyclerView rv;
    RecyclerView.LayoutManager mLayoutManager;
    RecyclerView.Adapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init_data();
        init_UI();
    }

    private void init_UI() {
        rv = (RecyclerView) findViewById(R.id.rv);

        mLayoutManager = new LinearLayoutManager(this);
        rv.setLayoutManager(mLayoutManager);

        mAdapter = new CustomAdapter(this,topics);
        rv.setAdapter(mAdapter);
    }

    private void init_data(){
        topics = new ArrayList<MathTopic>();
        topics.add(new MathTopic("Algebra","https://www.google.com/url?sa=i&url=https%3A%2F%2Falison.com%2Fcourse%2Fstrand-4-leaving-certificate-higher-level-algebra-revised&psig=AOvVaw2I7fqwCJ7H31_M0r4nTAcy&ust=1638645468744000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCMDcvpusyPQCFQAAAAAdAAAAABAD"));
        topics.add(new MathTopic("Calculus and analysis","https://www.google.com/url?sa=i&url=https%3A%2F%2Fen.wikipedia.org%2Fwiki%2FCalculus&psig=AOvVaw0yTX3n3PDLK0nbxTzOcceY&ust=1638645492028000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCPD63qesyPQCFQAAAAAdAAAAABAD"));
        topics.add(new MathTopic("Geometry and topology","https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.quora.com%2FIs-topology-a-branch-of-geometry-Why-is-a-topology-important&psig=AOvVaw1mjVwuqfXr38UsCWGTHrK0&ust=1638645512413000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCICk8bOsyPQCFQAAAAAdAAAAABAD"));
        topics.add(new MathTopic("Combinatorics","https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.hackerearth.com%2Fpractice%2Fmath%2Fcombinatorics%2Fbasics-of-combinatorics%2Ftutorial%2F&psig=AOvVaw3aQNfWzRAg3Mi34lTOBDF2&ust=1638645534450000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCMCC-busyPQCFQAAAAAdAAAAABAD"));
        topics.add(new MathTopic("Logic","https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.pinterest.com%2F62tenbluegreend%2Flogic%2F&psig=AOvVaw2-1MIljtRbitS9qOJHFBRM&ust=1638645561968000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCMC02c6syPQCFQAAAAAdAAAAABAU"));
        topics.add(new MathTopic("Number theory","https://www.google.com/url?sa=i&url=https%3A%2F%2Fen.wikipedia.org%2Fwiki%2FNumber_theory&psig=AOvVaw1fjHAlV-qE76XnELO50Vp5&ust=1638645598109000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCLiNstusyPQCFQAAAAAdAAAAABAO"));
        topics.add(new MathTopic("Dynamical systems and differential equations","https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.colorado.edu%2Famath%2Fcourse-pages%2Fspring-2018%2Fappm5460&psig=AOvVaw2-8L16XM9Ca5KH4BeDfbdp&ust=1638645623526000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCNiByeasyPQCFQAAAAAdAAAAABAD"));
        topics.add(new MathTopic("Mathematical physics","https://www.google.com/url?sa=i&url=https%3A%2F%2Fen.wikipedia.org%2Fwiki%2FMathematical_physics&psig=AOvVaw0GCQY1bQDv1HdRKLDs30DN&ust=1638645638457000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCNDkg-6syPQCFQAAAAAdAAAAABAD"));

    }
}