package com.example.stringresource24112020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText mEdtAccount,mEdtPassword;
    Button mBtnLogin;
    TextView mTvInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEdtAccount = findViewById(R.id.edittextTaikhoan);
        mEdtPassword = findViewById(R.id.edittextMatkhau);
        mBtnLogin = findViewById(R.id.buttonDangnhap);
        mTvInfo = findViewById(R.id.textviewThongtin);

        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tk = mEdtAccount.getText().toString();
                String mk = mEdtPassword.getText().toString();

                if (tk.equals("android24112020") && mk.equals("123456")){
                    Toast.makeText(MainActivity.this, "Đăng nhập thành công", Toast.LENGTH_SHORT).show();

                    String templateTk = getResources().getString(R.string.text_account);
                    String templateMk = getResources().getString(R.string.text_password);

                    mTvInfo.setText(templateTk + " : " + tk + "\n" + templateMk + " : " + mk);
                }
            }
        });
    }
}