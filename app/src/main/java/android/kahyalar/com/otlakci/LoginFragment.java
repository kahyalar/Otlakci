package android.kahyalar.com.otlakci;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by kahyalar on 25/12/2016.
 */

public class LoginFragment extends Fragment {

    private Button btnLogin;
    private View root;

    public void initViews(){
        btnLogin = (Button)root.findViewById(R.id.btnLogin);
    }

    public void initHelpers(){
        btnLogin_Click();
    }

    public void btnLogin_Click(){
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Giriş yapılıyor..", Toast.LENGTH_LONG).show();
                Intent toMaps = new Intent(getContext(), MapActivity.class);
                startActivity(toMaps);
                getActivity().finish();
            }
        });
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_login, container, false);
        initViews();
        initHelpers();
        return root;
    }
}
