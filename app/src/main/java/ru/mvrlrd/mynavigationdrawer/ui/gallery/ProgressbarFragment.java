package ru.mvrlrd.mynavigationdrawer.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import ru.mvrlrd.mynavigationdrawer.R;

public class ProgressbarFragment extends Fragment {

    private ProgressbarViewModel progressbarViewModel;
    ProgressBar progressBar;
    Button button;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        progressbarViewModel =
                ViewModelProviders.of(this).get(ProgressbarViewModel.class);
        View root = inflater.inflate(R.layout.fragment_progressbar, container, false);

        progressBar = (ProgressBar) root.findViewById(R.id.progressBar);
        progressBar.setVisibility(ProgressBar.VISIBLE);

        button = (Button) root.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                if (progressBar.getVisibility() == View.INVISIBLE) {
                    button.setText("STOP");
                    progressBar.setVisibility(View.VISIBLE);
                } else {
                    button.setText("START");
                    progressBar.setVisibility(View.INVISIBLE);
                }
//                progressBar.setVisibility(View.INVISIBLE);
//                progressBar.setVisibility(ProgressBar.GONE);

            }
        });




        return root;
    }


}
