package com.example.it2.axpresslogisticapp.acitvities;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.it2.axpresslogisticapp.R;
import com.google.android.gms.flags.Flag;

import org.json.JSONException;
import org.json.JSONObject;

public class EmpProfileActivity extends AppCompatActivity implements View.OnClickListener{
    Boolean FLAG = false;
    EditText edtName,edtEmpCode,edtContactNo,edtDesignation,edtDept,edtBranch,edtBranchCode,
                edtEmail,edtFatherName,edtDOB,edtBOP,edtDOJ,edtQulification,edtAdharCard,
                edtAddress,edtPAN,edtUAN,edtESI,edtBankAccount,edtBankName,edtBankIFSC;
    TextView txtName,txtEmpId;
    String strName,strEmpCode,strContactNo,strDesignation,strDept,strBranch,strBranchCode,
            strEmail,strFatherName,strDOB,strBOP,strDOJ,strQulification,strAdharCard,
            strAddress,strPAN,strUAN,strESI,strBankAccount,strBankName,strBankIFSC;
    ImageButton edtAddressBtn,edtBankAccountBtn,edtBankNameBtn,edtIFSCBtn;
    Intent intent;
    String jsonString;
    JSONObject jObj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emp_profile);
        //Set View with fields..
        setView();

        try {
            intent = getIntent();
            jsonString = intent.getStringExtra("response");
            jObj = new JSONObject(jsonString);
            //get employee info from API's...
            getValuesFromAPI();
            //set employee info in field...
            setValuesInFields();

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private void setValuesInFields() {
        txtName.setText(strName.trim());
        txtEmpId.setText(strEmpCode.trim().toString());
        //put employee info value..
        edtName.setText(strName.trim());
        edtEmpCode.setText(strEmpCode.trim());
        edtContactNo.setText(strContactNo.trim());
        edtDesignation.setText(strDesignation.trim());
        edtDept.setText(strDept.trim());
        edtBranch.setText(strBranch.trim());
        edtBranchCode.setText(strBranchCode.trim());
        edtEmail.setText(strEmail.trim());
        //put employee ipersonal info..
        edtFatherName.setText(strFatherName.trim());
        edtDOB.setText(strDOB.trim());
        edtBOP.setText(strBOP.trim());
        edtDOJ.setText(strDOJ.trim());
        edtQulification.setText(strQulification.trim());
        edtAdharCard.setText(strAdharCard.trim());
        edtAddress.setText(strAddress.trim());
        edtPAN.setText(strPAN.trim());
        edtUAN.setText(strUAN.trim());
        edtESI.setText(strESI.trim());
        edtBankAccount.setText(strBankAccount.trim());
        edtBankName.setText(strBankName.trim());
        edtBankIFSC.setText(strBankIFSC.trim());
    }

    private void getValuesFromAPI() {
        strName = jObj.optString("Employee_Name");
        strEmpCode = jObj.optString("Emplid");
        strContactNo = jObj.optString("Employee_Contact");
        strDesignation = jObj.optString("Employee_Designation");
        strDept = jObj.optString("Employee_Department");
        strBranch = jObj.optString("Employee_Branch");
        strBranchCode = jObj.optString("Employee_Branch");
        strEmail = jObj.optString("Employee_Email");
        //get employee personal info..
        strFatherName = jObj.optString("Employee_Father_Name");
        strDOB = jObj.optString("Employee_DOB");
        strBOP = jObj.optString("Employee_birth_state");
        strDOJ = jObj.optString("Employee_DOJ");
        strQulification = jObj.optString("Employee_Qualification");
        strAdharCard = jObj.optString("Employee_AdhaarNo");
        strAddress = jObj.optString("Employee_Address");
        //get employee bank/imp info..
        strPAN = jObj.optString("Employee_PanNo");
        strUAN = jObj.optString("Employee_UanNO");
        strESI = jObj.optString("Employee_EsicNo");
        strBankAccount = jObj.optString("Employee_BanckAC");
        strBankName = jObj.optString("Employee_BankName");
        strBankIFSC = jObj.optString("Employee_IfscCode");
    }

    private void setView() {
        edtName = findViewById(R.id.edtname);
        edtEmpCode = findViewById(R.id.edtEmpCode);
        edtContactNo = findViewById(R.id.edtContactNo);
        edtDesignation = findViewById(R.id.edtDesignation);
        edtDept = findViewById(R.id.edtDept);
        edtBranch = findViewById(R.id.edtBranch);
        edtBranchCode = findViewById(R.id.edtBranchCode);
        edtEmail = findViewById(R.id.edtEmail);
        // put employee personal id..
        edtFatherName = findViewById(R.id.edtFatherName);
        edtDOB = findViewById(R.id.edtDOB);
        edtBOP = findViewById(R.id.edtBOP);
        edtDOJ = findViewById(R.id.edtDOJ);
        edtQulification = findViewById(R.id.edtQulification);
        edtAdharCard = findViewById(R.id.edtAdharCard);
        edtAddress = findViewById(R.id.edtAddress);
        //put employee bank info..
        edtPAN = findViewById(R.id.edtPAN);
        edtUAN = findViewById(R.id.edtUAN);
        edtESI = findViewById(R.id.edtESI);
        edtBankAccount = findViewById(R.id.edtBankAccount);
        edtBankName = findViewById(R.id.edtBankName);
        edtBankIFSC = findViewById(R.id.edtBankIFSC);
        txtName = findViewById(R.id.user_nameId);
        txtEmpId = findViewById(R.id.user_empcodeId);


        //edit edittextfield on btn click..
        edtAddressBtn = findViewById(R.id.edtImageButtonAddress);
        edtBankAccountBtn = findViewById(R.id.edtImageButtonBankAccount);
        edtBankNameBtn = findViewById(R.id.edtImageButtonbankName);
        edtIFSCBtn = findViewById(R.id.edtImageButtonBankIFSC);
        edtAddressBtn.setOnClickListener(this);
        edtBankAccountBtn.setOnClickListener(this);
        edtBankNameBtn.setOnClickListener(this);
        edtIFSCBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.edtImageButtonAddress:
                if (FLAG.equals(false)){
//                    hide_keyboard();
                    Toast.makeText(getApplicationContext(),"enable",Toast.LENGTH_SHORT).show();
                    edtAddress.setEnabled(true);
                    edtAddress.setFocusable(true);
                    edtAddress.setFocusableInTouchMode(true);
                    edtAddress.requestFocus();
                    edtAddress.getEditableText();
                    InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.showSoftInput(edtAddress, InputMethodManager.SHOW_IMPLICIT);
                    FLAG = true;
                } else {
                    Toast.makeText(getApplicationContext(),"disable",Toast.LENGTH_SHORT).show();
                    edtAddress.setFocusable(false);
                    edtAddress.setFocusableInTouchMode(false);
                    edtAddress.setClickable(false);
                    FLAG = false;
                }
                break;
            case R.id.edtImageButtonBankAccount:
                if (FLAG.equals(false)){
//                    hide_keyboard();
                    Toast.makeText(getApplicationContext(),"enable",Toast.LENGTH_SHORT).show();
                    edtBankAccount.setEnabled(true);
                    edtBankAccount.setFocusable(true);
                    edtBankAccount.setFocusableInTouchMode(true);
                    edtBankAccount.requestFocus();
                    edtBankAccount.setClickable(true);
                    edtBankAccount.getEditableText();
                    InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.showSoftInput(edtBankAccount, InputMethodManager.SHOW_IMPLICIT);
                    FLAG = true;
                } else {
                    Toast.makeText(getApplicationContext(),"disable",Toast.LENGTH_SHORT).show();
                    edtBankAccount.setFocusable(false);
                    edtBankAccount.setFocusableInTouchMode(false);
                    edtBankAccount.setClickable(false);
                    FLAG = false;
                }
//
                break;
            case R.id.edtImageButtonbankName:

                break;
            case R.id.edtImageButtonBankIFSC:

                break;
        }
    }
}
