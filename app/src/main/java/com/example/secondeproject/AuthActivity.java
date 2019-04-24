package com.example.secondeproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
                                                            //AuthActiviti посвящено активити для авторификации пользователя в приложении
public class AuthActivity extends AppCompatActivity {       //

    private EditText mLogin;       // переменная для хранения текста введенного пользователем в логин
    private EditText mPassword;    // переменная для хранения текста введенного пользователем в логин
    private Button mEnter;         // кнопка входа

    private Button mRegister;      // кнопка регистрации

    private View.OnClickListener mOnEnterClickListener = new View.OnClickListener() {   //обработка нажатия на кнопку "Войти"
        @Override
        public void onClick(View view) {
            //todo Обработка нажатия на кнопке
        }
    };
    private View.OnClickListener mOnRegisterClickListener = new View.OnClickListener() { //обработка нажатия на кнопку "Зарегистрироваться"
        @Override
        public void onClick(View view) {
            //todo Обработка нажатия на кнопке
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac_auth);
                                                                 //метод findViewById() возвращает объект класса View по его идентификатору на разметке
        mLogin = findViewById(R.id.etLogin);                     //вывод окна для ввода логина
        mPassword = findViewById(R.id.etPassword);               //вывод окна для ввода пароля
        mEnter = findViewById(R.id.buttonEnter);                 //вывод кнопки входа
        mRegister= findViewById(R.id.buttonRegister);            //вывод кнопки регистрации

        mEnter.setOnClickListener(mOnEnterClickListener);         //установка регистратора события (нажатия на кнопку Вход
        mRegister.setOnClickListener(mOnRegisterClickListener);   //установка регистратора события (нажатия на кнопку Регистрация
    }
}
