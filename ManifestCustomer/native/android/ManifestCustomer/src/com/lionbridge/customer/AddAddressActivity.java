package com.lionbridge.customer;

import com.yonyou.uap.um.application.ApplicationContext;
import com.yonyou.uap.um.base.*;
import com.yonyou.uap.um.common.*;
import com.yonyou.uap.um.third.*;
import com.yonyou.uap.um.control.*;
import com.yonyou.uap.um.core.*;
import com.yonyou.uap.um.binder.*;
import com.yonyou.uap.um.runtime.*;
import com.yonyou.uap.um.lexer.*;
import com.yonyou.uap.um.widget.*;
import com.yonyou.uap.um.widget.UmpSlidingLayout.SlidingViewType;
import com.yonyou.uap.um.log.ULog;
import java.util.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.webkit.*;
import android.content.*;
import android.graphics.*;
import android.widget.ImageView.ScaleType;

public abstract class AddAddressActivity extends UMWindowActivity {

	protected UMWindow AddAddress = null;
protected XVerticalLayout viewPage0 = null;
protected XHorizontalLayout navigatorbar0 = null;
protected UMImageButton imagebutton0 = null;
protected UMLabel label1 = null;
protected UMButton button0 = null;
protected UMLabel label0 = null;

	
	protected final static int ID_ADDADDRESS = 2139143134;
protected final static int ID_VIEWPAGE0 = 211048763;
protected final static int ID_NAVIGATORBAR0 = 471897127;
protected final static int ID_IMAGEBUTTON0 = 114354819;
protected final static int ID_LABEL1 = 1703776763;
protected final static int ID_BUTTON0 = 1523773057;
protected final static int ID_LABEL0 = 1441374100;

	
	
	@Override
	public String getControllerName() {
		return "AddAddressController";
	}
	
	@Override
	public String getContextName() {
		return "";
	}

	@Override
	public String getNameSpace() {
		return "com.lionbridge.customer";
	}

	protected void onCreate(Bundle savedInstanceState) {
		ULog.logLC("onCreate", this);
		super.onCreate(savedInstanceState);
        onInit(savedInstanceState);
        
	}
	
	@Override
	protected void onStart() {
		ULog.logLC("onStart", this);
		
		super.onStart();
	}

	@Override
	protected void onRestart() {
		ULog.logLC("onRestart", this);
		
		super.onRestart();
	}

	@Override
	protected void onResume() {
		ULog.logLC("onResume", this);
		
		super.onResume();
	}

	@Override
	protected void onPause() {
		ULog.logLC("onPause", this);
		
		super.onPause();
	}

	@Override
	protected void onStop() {
		ULog.logLC("onStop", this);
		
		super.onStop();
	}

	@Override
	protected void onDestroy() {
		ULog.logLC("onDestroy", this);
		
		super.onDestroy();
	}
	
	public  void onInit(Bundle savedInstanceState) {
		ULog.logLC("onInit", this);
		UMActivity context = this;
		registerControl();
		this.getContainer();
		
		/*
		 new Thread() {
			 public void run() {
				 UMPDebugClient.startServer();
			 }
		 }.start();
		*/
		String sys_debug = ApplicationContext.getCurrent(this).getValue("sys_debug");
		if (sys_debug != null && sys_debug.equalsIgnoreCase("true")) {
			UMPDebugClient.waitForDebug();
		}

		IBinderGroup binderGroup = this;
		currentPage = getCurrentWindow(context, binderGroup);
super.setContentView(currentPage);

		
	}
	
	private void registerControl() {
		  idmap.put("AddAddress",ID_ADDADDRESS);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("navigatorbar0",ID_NAVIGATORBAR0);
  idmap.put("imagebutton0",ID_IMAGEBUTTON0);
  idmap.put("label1",ID_LABEL1);
  idmap.put("button0",ID_BUTTON0);
  idmap.put("label0",ID_LABEL0);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		
	}
	
	public void onDatabinding() {
		ULog.logLC("onDatabinding", this);
		super.onDatabinding();
		
	}
	
	@Override
	public void onReturn(String methodName, Object returnValue) {
		
	}

	@Override
	public void onAfterInit() {
		ULog.logLC("onAfterInit", this);
		
		onLoad();
	}
	
		@Override
	public Map<String,String> getPlugout(String id) {
		XJSON from = this.getUMContext();
		Map<String,String> r = super.getPlugout(id);
		
		return r;	
	}
	
	
	
	public View getNavigatorbar0View(final UMActivity context,IBinderGroup binderGroup) {
navigatorbar0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_NAVIGATORBAR0
,"padding-left","8"
,"padding-right","8"
,"halign","LEFT"
,"width","fill"
,"title","常用地址"
,"height","44.0"
,"color","#d68f2f"
,"layout-type","linear"
,"font-size","20"
,"background","#321e12"
,"font-family","default"
,"valign","center"
);
imagebutton0 = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_IMAGEBUTTON0
,"halign","center"
,"width","44"
,"icon-width","15"
,"istogglebutton","false"
,"font-pressed-color","#e50011"
,"imagebuttontype","icon"
,"icon-height","21"
,"height","44"
,"color","#919191"
,"layout-type","linear"
,"font-size","10"
,"icon-background-image","i_back.png"
,"onclick","action:imagebutton0_onclick"
,"font-family","default"
,"valign","center"
,"checked","false"
,"icon-text-spacing","3"
);
navigatorbar0.addView(imagebutton0);
label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL1
,"halign","center"
,"height","fill"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","0"
,"font-family","default"
,"valign","center"
);
navigatorbar0.addView(label1);
button0 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON0
,"halign","center"
,"height","44"
,"color","#d68f2f"
,"layout-type","linear"
,"width","44"
,"font-size","16"
,"value","确定"
,"font-family","default"
,"font-pressed-color","#ffff33"
,"valign","center"
);
navigatorbar0.addView(button0);

return navigatorbar0;
}
public View getViewPage0View(final UMActivity context,IBinderGroup binderGroup) {
viewPage0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_VIEWPAGE0
,"halign","center"
,"height","fill"
,"layout-type","vbox"
,"background","#F5F5F5"
,"width","fill"
,"valign","TOP"
);
View navigatorbar0 = (View) getNavigatorbar0View((UMActivity)context,binderGroup);
viewPage0.addView(navigatorbar0);
label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL0
,"halign","center"
,"height","2"
,"color","#000000"
,"layout-type","linear"
,"background","#ec9e34"
,"font-size","14"
,"width","fill"
,"font-family","default"
,"valign","center"
);
viewPage0.addView(label0);

return viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup) {
AddAddress = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_ADDADDRESS
,"halign","center"
,"height","fill"
,"layout","vbox"
,"width","fill"
,"controller","AddAddressController"
,"valign","TOP"
,"namespace","com.lionbridge.customer"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup);
AddAddress.addView(viewPage0);

return (UMWindow)AddAddress;
}

	
	public void actionImagebutton0_onclick(View control, UMEventArgs args) {
    String actionid = "imagebutton0_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "this.closeAddAddress()",UMActivity.getViewId(control),args);
}


}
