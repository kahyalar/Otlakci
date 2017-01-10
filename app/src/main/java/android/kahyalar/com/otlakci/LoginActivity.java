package android.kahyalar.com.otlakci;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by kahyalar on 25/12/2016.
 */

public class LoginActivity extends AppCompatActivity {//NOSONAR

    private Button btnLogin;

    public void initViews(){
        btnLogin = (Button) findViewById(R.id.btnLogin);
    }

    public void initHelpers(){
        btnLogin_Click();
    }

    public void btnLogin_Click(){//NOSONAR
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initViews();
        initHelpers();
    }


}
