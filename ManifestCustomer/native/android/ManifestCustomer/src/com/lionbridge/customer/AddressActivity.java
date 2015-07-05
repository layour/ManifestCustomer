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

public abstract class AddressActivity extends UMWindowActivity {

	protected UMWindow Address = null;
protected XVerticalLayout viewPage0 = null;
protected XHorizontalLayout navigatorbar0 = null;
protected UMImageButton imagebutton0 = null;
protected UMLabel label1 = null;
protected UMButton button0 = null;
protected UMLabel label0 = null;
protected UMListViewBase listviewdefine0 = null;
protected XVerticalLayout panel0 = null;
protected XHorizontalLayout panel1 = null;
protected UMLabel label4 = null;
protected UMLabel label5 = null;
protected UMLabel label3 = null;
protected UMLabel label2 = null;
protected UMLabel label6 = null;
protected XHorizontalLayout panel2 = null;
protected UMImageButton imagebutton1 = null;
protected UMImageButton imagebutton2 = null;

	
	protected final static int ID_ADDRESS = 449007634;
protected final static int ID_VIEWPAGE0 = 498082966;
protected final static int ID_NAVIGATORBAR0 = 885339585;
protected final static int ID_IMAGEBUTTON0 = 893951307;
protected final static int ID_LABEL1 = 423022973;
protected final static int ID_BUTTON0 = 962893230;
protected final static int ID_LABEL0 = 1722312793;
protected final static int ID_LISTVIEWDEFINE0 = 1347758848;
protected final static int ID_PANEL0 = 1628921754;
protected final static int ID_PANEL1 = 25085162;
protected final static int ID_LABEL4 = 497367417;
protected final static int ID_LABEL5 = 1920381876;
protected final static int ID_LABEL3 = 964675432;
protected final static int ID_LABEL2 = 1691841545;
protected final static int ID_LABEL6 = 1269282633;
protected final static int ID_PANEL2 = 876429050;
protected final static int ID_IMAGEBUTTON1 = 848512515;
protected final static int ID_IMAGEBUTTON2 = 2048805271;

	
	
	@Override
	public String getControllerName() {
		return "AddressController";
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
		  idmap.put("Address",ID_ADDRESS);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("navigatorbar0",ID_NAVIGATORBAR0);
  idmap.put("imagebutton0",ID_IMAGEBUTTON0);
  idmap.put("label1",ID_LABEL1);
  idmap.put("button0",ID_BUTTON0);
  idmap.put("label0",ID_LABEL0);
  idmap.put("listviewdefine0",ID_LISTVIEWDEFINE0);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("panel1",ID_PANEL1);
  idmap.put("label4",ID_LABEL4);
  idmap.put("label5",ID_LABEL5);
  idmap.put("label3",ID_LABEL3);
  idmap.put("label2",ID_LABEL2);
  idmap.put("label6",ID_LABEL6);
  idmap.put("panel2",ID_PANEL2);
  idmap.put("imagebutton1",ID_IMAGEBUTTON1);
  idmap.put("imagebutton2",ID_IMAGEBUTTON2);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //listviewdefine0 - action:listviewdefine0_onload
    UMEventArgs args = new UMEventArgs(AddressActivity.this);
    actionListviewdefine0_onload(listviewdefine0,args);

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
,"value","添加"
,"onclick","action:button0_onclick"
,"font-family","default"
,"font-pressed-color","#ffff33"
,"valign","center"
);
navigatorbar0.addView(button0);

return navigatorbar0;
}
public View getPanel1View(final UMActivity context,IBinderGroup binderGroup) {
panel1 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL1
,"margin-right","10"
,"halign","LEFT"
,"height","30"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"margin-left","10"
,"valign","center"
);
label4 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL4
,"content","思齐"
,"bindfield","name"
,"halign","left"
,"height","20"
,"weight","1"
,"color","#030303"
,"layout-type","linear"
,"font-size","16"
,"width","0"
,"font-family","default"
,"valign","center"
);
panel1.addView(label4);
label5 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL5
,"content","13635688422"
,"bindfield","phone"
,"halign","right"
,"height","20"
,"weight","1"
,"color","#030303"
,"layout-type","linear"
,"font-size","16"
,"width","0"
,"font-family","default"
,"valign","center"
);
panel1.addView(label5);

return panel1;
}
public View getPanel2View(final UMActivity context,IBinderGroup binderGroup) {
panel2 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL2
,"margin-right","10"
,"halign","RIGHT"
,"height","30"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"margin-left","10"
,"valign","center"
);
imagebutton1 = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_IMAGEBUTTON1
,"halign","center"
,"text-align","right"
,"width","64"
,"icon-width","18"
,"istogglebutton","false"
,"font-pressed-color","#FF7800"
,"icon-height","18"
,"height","30"
,"color","#aaaaaa"
,"layout-type","linear"
,"font-size","12"
,"icon-background-image","tool_edit_touch.png"
,"value","编辑"
,"icon-pressed-image","tool_edit.png"
,"font-family","default"
,"valign","center"
,"checked","false"
,"icon-text-spacing","3"
);
panel2.addView(imagebutton1);
imagebutton2 = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_IMAGEBUTTON2
,"halign","center"
,"text-align","right"
,"width","64"
,"icon-width","18"
,"istogglebutton","false"
,"font-pressed-color","#FF7800"
,"icon-height","18"
,"height","30"
,"color","#aaaaaa"
,"layout-type","linear"
,"font-size","12"
,"icon-background-image","tab_delete_touch.png"
,"value","删除"
,"icon-pressed-image","tool_delete.png"
,"font-family","default"
,"valign","center"
,"checked","false"
,"icon-text-spacing","3"
);
panel2.addView(imagebutton2);

return panel2;
}
public View getPanel0View(final UMActivity context,IBinderGroup binderGroup) {
panel0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL0
,"border-bottom-width","1"
,"halign","left"
,"height","112"
,"layout-type","vbox"
,"background","#FFFFFF"
,"width","fill"
,"valign","CENTER"
,"border-bottom-color","#C7C7C7"
);
View panel1 = (View) getPanel1View((UMActivity)context,binderGroup);
panel0.addView(panel1);
label3 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL3
,"bindfield","address"
,"halign","left"
,"width","fill"
,"content","北京市昌平区回龙观"
,"margin-right","15"
,"height","wrap"
,"color","#999999"
,"heightwrap","20.0"
,"font-size","14"
,"layout-type","linear"
,"margin-left","15"
,"font-family","default"
,"valign","center"
);
panel0.addView(label3);
label2 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL2
,"bindfield","detail"
,"halign","left"
,"width","fill"
,"content","和谐家园二区12号楼6单元"
,"margin-right","15"
,"height","wrap"
,"color","#aaaaaa"
,"heightwrap","20.0"
,"font-size","14"
,"layout-type","linear"
,"margin-left","15"
,"font-family","default"
,"valign","center"
);
panel0.addView(label2);
label6 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL6
,"halign","center"
,"width","fill"
,"margin-right","10"
,"height","1"
,"color","#000000"
,"font-size","14"
,"background","#f2f2f2"
,"layout-type","linear"
,"margin-left","10"
,"font-family","default"
,"margin-top","5"
,"valign","center"
);
panel0.addView(label6);
View panel2 = (View) getPanel2View((UMActivity)context,binderGroup);
panel0.addView(panel2);

return panel0;
}
public View getListviewdefine0View(final UMActivity context,IBinderGroup binderGroup) {
listviewdefine0 = (UMListViewBase)ThirdControl.createControl(new UMListViewBase(context),ID_LISTVIEWDEFINE0
,"bindfield","list"
,"halign","center"
,"height","0"
,"weight","1"
,"onload","action:listviewdefine0_onload"
,"layout","vbox"
,"width","fill"
,"valign","TOP"
);
listviewdefine0.addListItemView("getPanel0View");

return listviewdefine0;
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
View listviewdefine0 = (View) getListviewdefine0View((UMActivity)context,binderGroup);
viewPage0.addView(listviewdefine0);

return viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup) {
Address = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_ADDRESS
,"halign","center"
,"height","fill"
,"layout","vbox"
,"width","fill"
,"controller","AddressController"
,"valign","TOP"
,"namespace","com.lionbridge.customer"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup);
Address.addView(viewPage0);

return (UMWindow)Address;
}

	
	public void actionButton0_onclick(View control, UMEventArgs args) {
    String actionid = "button0_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "this.openAddAddress()",UMActivity.getViewId(control),args);
}
public void actionListviewdefine0_onload(View control, UMEventArgs args) {
    String actionid = "listviewdefine0_onload";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "this.loadAddress()",UMActivity.getViewId(control),args);
}
public void actionImagebutton0_onclick(View control, UMEventArgs args) {
    String actionid = "imagebutton0_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "this.closeAddress()",UMActivity.getViewId(control),args);
}


}
