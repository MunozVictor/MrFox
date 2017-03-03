package com.example.vicapps.mrfox;


import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.widget.Button;
import android.widget.EditText;

public class MyTest extends ActivityInstrumentationTestCase2<MyLogin> {
    private static final String USERNAME ="USERNAME" ;
    private static final String PASSWORD = "PASSWORD";
    private Button btnLog;
private MyLogin actividad;
    private EditText etPass;
    private EditText etNombre;


    public MyTest() {
//		super("com.example.calc", MainActivity.class);
        super(MyLogin.class);
    }
    protected void setUp() throws Exception {
        super.setUp();
        actividad = getActivity();
        btnLog = (Button) actividad.findViewById(R.id.btn_login);
        etPass = (EditText) actividad.findViewById(R.id.tv_contraseña);
        etNombre = (EditText) actividad.findViewById(R.id.tv_name);

    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    // Pre-condición de campos no vacios
    public void testPreconditions() {
        assertNotNull(etNombre);
        assertNotNull(etPass);
    }



    public void testLog() {
        //on value 1 entry
        TouchUtils.tapView(this, etNombre);
        sendKeys(USERNAME);
        // now on value2 entry
        TouchUtils.tapView(this, etPass);
        sendKeys(PASSWORD);

        TouchUtils.clickView(this, btnLog);
        assertTrue("Add result should be...", true);
    }



}

