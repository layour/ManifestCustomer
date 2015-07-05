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

public abstract class AboutActivity extends UMWindowActivity {

	protected UMWindow About = null;
protected XVerticalLayout viewPage0 = null;
protected XHorizontalLayout navigatorbar0 = null;
protected UMImageButton imagebutton1 = null;
protected UMLabel label1 = null;
protected XVerticalLayout panel6 = null;
protected XHorizontalLayout panel0 = null;
protected UMImage image0 = null;
protected UMLabel label0 = null;
protected UMLabel label2 = null;
protected XHorizontalLayout panel1 = null;
protected UMImage image1 = null;
protected UMLabel label3 = null;
protected UMLabel label13 = null;
protected UMLabel label4 = null;
protected XHorizontalLayout panel2 = null;
protected UMImage image2 = null;
protected UMLabel label5 = null;
protected XVerticalLayout panel7 = null;
protected XHorizontalLayout panel3 = null;
protected UMImage image3 = null;
protected UMLabel label7 = null;
protected UMLabel label8 = null;
protected XHorizontalLayout panel4 = null;
protected UMImage image4 = null;
protected UMLabel label9 = null;
protected UMLabel label10 = null;
protected XHorizontalLayout panel5 = null;
protected UMImage image5 = null;
protected UMLabel label11 = null;
protected UMButton button0 = null;

	
	protected final static int ID_ABOUT = 965052926;
protected final static int ID_VIEWPAGE0 = 942374247;
protected final static int ID_NAVIGATORBAR0 = 992388928;
protected final static int ID_IMAGEBUTTON1 = 1212168407;
protected final static int ID_LABEL1 = 1165139847;
protected final static int ID_PANEL6 = 1202872317;
protected final static int ID_PANEL0 = 680077579;
protected final static int ID_IMAGE0 = 399457210;
protected final static int ID_LABEL0 = 698577239;
protected final static int ID_LABEL2 = 2139029291;
protected final static int ID_PANEL1 = 450251767;
protected final static int ID_IMAGE1 = 255795551;
protected final static int ID_LABEL3 = 755561102;
protected final static int ID_LABEL13 = 318504715;
protected final static int ID_LABEL4 = 1562385723;
protected final static int ID_PANEL2 = 63838750;
protected final static int ID_IMAGE2 = 1386861715;
protected final static int ID_LABEL5 = 1272344657;
protected final static int ID_PANEL7 = 419806336;
protected final static int ID_PANEL3 = 1297941828;
protected final static int ID_IMAGE3 = 978762339;
protected final static int ID_LABEL7 = 1106068788;
protected final static int ID_LABEL8 = 1970375596;
protected final static int ID_PANEL4 = 1706306965;
protected final static int ID_IMAGE4 = 820140948;
protected final static int ID_LABEL9 = 184462989;
protected final static int ID_LABEL10 = 1012591750;
protected final static int ID_PANEL5 = 1900398139;
protected final static int ID_IMAGE5 = 1126284562;
protected final static int ID_LABEL11 = 462027038;
protected final static int ID_BUTTON0 = 492958827;

	
	
	@Override
	public String getControllerName() {
		return "AboutController";
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
		  idmap.put("About",ID_ABOUT);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("navigatorbar0",ID_NAVIGATORBAR0);
  idmap.put("imagebutton1",ID_IMAGEBUTTON1);
  idmap.put("label1",ID_LABEL1);
  idmap.put("panel6",ID_PANEL6);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("image0",ID_IMAGE0);
  idmap.put("label0",ID_LABEL0);
  idmap.put("label2",ID_LABEL2);
  idmap.put("panel1",ID_PANEL1);
  idmap.put("image1",ID_IMAGE1);
  idmap.put("label3",ID_LABEL3);
  idmap.put("label13",ID_LABEL13);
  idmap.put("label4",ID_LABEL4);
  idmap.put("panel2",ID_PANEL2);
  idmap.put("image2",ID_IMAGE2);
  idmap.put("label5",ID_LABEL5);
  idmap.put("panel7",ID_PANEL7);
  idmap.put("panel3",ID_PANEL3);
  idmap.put("image3",ID_IMAGE3);
  idmap.put("label7",ID_LABEL7);
  idmap.put("label8",ID_LABEL8);
  idmap.put("panel4",ID_PANEL4);
  idmap.put("image4",ID_IMAGE4);
  idmap.put("label9",ID_LABEL9);
  idmap.put("label10",ID_LABEL10);
  idmap.put("panel5",ID_PANEL5);
  idmap.put("image5",ID_IMAGE5);
  idmap.put("label11",ID_LABEL11);
  idmap.put("button0",ID_BUTTON0);

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
,"title","我"
,"height","44.0"
,"color","#d68f2f"
,"layout-type","linear"
,"font-size","20"
,"background","#321e12"
,"font-family","default"
,"valign","center"
);
imagebutton1 = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_IMAGEBUTTON1
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
,"onclick","action:imagebutton1_onclick"
,"font-family","default"
,"valign","center"
,"checked","false"
,"icon-text-spacing","3"
);
navigatorbar0.addView(imagebutton1);

return navigatorbar0;
}
public View getPanel0View(final UMActivity context,IBinderGroup binderGroup) {
panel0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL0
,"padding-left","10"
,"padding-right","10"
,"halign","LEFT"
,"height","44"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"onclick","action:panel0_onclick"
,"valign","center"
);
image0 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGE0
,"height","26"
,"layout-type","linear"
,"width","26"
,"scaletype","fitcenter"
,"src","i_order.png"
);
panel0.addView(image0);
label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL0
,"halign","center"
,"widthwrap","45.0"
,"width","wrap"
,"content","代金卷"
,"height","wrap"
,"color","#030303"
,"heightwrap","20.0"
,"font-size","14"
,"layout-type","linear"
,"margin-left","10"
,"font-family","default"
,"valign","center"
);
panel0.addView(label0);

return panel0;
}
public View getPanel1View(final UMActivity context,IBinderGroup binderGroup) {
panel1 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL1
,"padding-left","10"
,"padding-right","10"
,"halign","LEFT"
,"height","44"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"valign","center"
);
image1 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGE1
,"height","26"
,"layout-type","linear"
,"width","26"
,"scaletype","fitcenter"
,"src","i_order.png"
);
panel1.addView(image1);
label3 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL3
,"halign","center"
,"widthwrap","60.0"
,"width","wrap"
,"content","发票申请"
,"height","wrap"
,"color","#030303"
,"heightwrap","20.0"
,"font-size","14"
,"layout-type","linear"
,"margin-left","10"
,"font-family","default"
,"valign","center"
);
panel1.addView(label3);
label13 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL13
,"content","￥0"
,"halign","right"
,"height","wrap"
,"weight","1"
,"color","#ec9e34"
,"heightwrap","23.0"
,"layout-type","linear"
,"font-size","16"
,"width","0"
,"font-family","default"
,"valign","center"
);
panel1.addView(label13);

return panel1;
}
public View getPanel2View(final UMActivity context,IBinderGroup binderGroup) {
panel2 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL2
,"padding-left","10"
,"padding-right","10"
,"halign","LEFT"
,"height","44"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"onclick","action:panel2_onclick"
,"valign","center"
);
image2 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGE2
,"height","26"
,"layout-type","linear"
,"width","26"
,"scaletype","fitcenter"
,"src","i_location.png"
);
panel2.addView(image2);
label5 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL5
,"halign","center"
,"widthwrap","60.0"
,"width","wrap"
,"content","常用地址"
,"height","wrap"
,"color","#030303"
,"heightwrap","20.0"
,"font-size","14"
,"layout-type","linear"
,"margin-left","10"
,"font-family","default"
,"valign","center"
);
panel2.addView(label5);

return panel2;
}
public View getPanel6View(final UMActivity context,IBinderGroup binderGroup) {
panel6 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL6
,"halign","center"
,"height","134"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"margin-top","10"
,"valign","TOP"
);
View panel0 = (View) getPanel0View((UMActivity)context,binderGroup);
panel6.addView(panel0);
label2 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL2
,"margin-right","10"
,"halign","center"
,"height","1"
,"color","#000000"
,"layout-type","linear"
,"background","#dbdbdb"
,"font-size","14"
,"width","fill"
,"margin-left","10"
,"font-family","default"
,"valign","center"
);
panel6.addView(label2);
View panel1 = (View) getPanel1View((UMActivity)context,binderGroup);
panel6.addView(panel1);
label4 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL4
,"margin-right","10"
,"halign","center"
,"height","1"
,"color","#000000"
,"layout-type","linear"
,"background","#dbdbdb"
,"font-size","14"
,"width","fill"
,"margin-left","10"
,"font-family","default"
,"valign","center"
);
panel6.addView(label4);
View panel2 = (View) getPanel2View((UMActivity)context,binderGroup);
panel6.addView(panel2);

return panel6;
}
public View getPanel3View(final UMActivity context,IBinderGroup binderGroup) {
panel3 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL3
,"padding-left","10"
,"padding-right","10"
,"halign","LEFT"
,"height","44"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"onclick","action:panel3_onclick"
,"valign","center"
);
image3 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGE3
,"height","26"
,"layout-type","linear"
,"width","26"
,"scaletype","fitcenter"
,"src","i_oetup.png"
);
panel3.addView(image3);
label7 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL7
,"halign","center"
,"widthwrap","60.0"
,"width","wrap"
,"content","修改密码"
,"height","wrap"
,"color","#030303"
,"heightwrap","20.0"
,"font-size","14"
,"layout-type","linear"
,"margin-left","10"
,"font-family","default"
,"valign","center"
);
panel3.addView(label7);

return panel3;
}
public View getPanel4View(final UMActivity context,IBinderGroup binderGroup) {
panel4 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL4
,"padding-left","10"
,"padding-right","10"
,"halign","LEFT"
,"height","44"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"onclick","action:panel4_onclick"
,"valign","center"
);
image4 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGE4
,"height","26"
,"layout-type","linear"
,"width","26"
,"scaletype","fitcenter"
,"src","i_opinion.png"
);
panel4.addView(image4);
label9 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL9
,"halign","center"
,"widthwrap","60.0"
,"width","wrap"
,"content","意见反馈"
,"height","wrap"
,"color","#030303"
,"heightwrap","20.0"
,"font-size","14"
,"layout-type","linear"
,"margin-left","10"
,"font-family","default"
,"valign","center"
);
panel4.addView(label9);

return panel4;
}
public View getPanel5View(final UMActivity context,IBinderGroup binderGroup) {
panel5 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL5
,"padding-left","10"
,"padding-right","10"
,"halign","LEFT"
,"height","44"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"onclick","action:panel5_onclick"
,"valign","center"
);
image5 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGE5
,"height","26"
,"layout-type","linear"
,"width","26"
,"scaletype","fitcenter"
,"src","i_about.png"
);
panel5.addView(image5);
label11 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL11
,"halign","center"
,"widthwrap","60.0"
,"width","wrap"
,"content","关于我们"
,"height","wrap"
,"color","#030303"
,"heightwrap","20.0"
,"font-size","14"
,"layout-type","linear"
,"margin-left","10"
,"font-family","default"
,"valign","center"
);
panel5.addView(label11);

return panel5;
}
public View getPanel7View(final UMActivity context,IBinderGroup binderGroup) {
panel7 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL7
,"halign","center"
,"height","134"
,"layout-type","linear"
,"width","fill"
,"background","#ffffff"
,"margin-top","10"
,"valign","TOP"
);
View panel3 = (View) getPanel3View((UMActivity)context,binderGroup);
panel7.addView(panel3);
label8 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL8
,"margin-right","10"
,"halign","center"
,"height","1"
,"color","#000000"
,"layout-type","linear"
,"background","#dbdbdb"
,"font-size","14"
,"width","fill"
,"margin-left","10"
,"font-family","default"
,"valign","center"
);
panel7.addView(label8);
View panel4 = (View) getPanel4View((UMActivity)context,binderGroup);
panel7.addView(panel4);
label10 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL10
,"margin-right","10"
,"halign","center"
,"height","1"
,"color","#000000"
,"layout-type","linear"
,"background","#dbdbdb"
,"font-size","14"
,"width","fill"
,"margin-left","10"
,"font-family","default"
,"valign","center"
);
panel7.addView(label10);
View panel5 = (View) getPanel5View((UMActivity)context,binderGroup);
panel7.addView(panel5);

return panel7;
}
public View getViewPage0View(final UMActivity context,IBinderGroup binderGroup) {
viewPage0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_VIEWPAGE0
,"halign","center"
,"height","fill"
,"layout-type","vbox"
,"background","#ededed"
,"width","fill"
,"valign","TOP"
);
View navigatorbar0 = (View) getNavigatorbar0View((UMActivity)context,binderGroup);
viewPage0.addView(navigatorbar0);
label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL1
,"halign","center"
,"height","2"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"background","#ec9e34"
,"width","fill"
,"font-family","default"
,"valign","center"
);
viewPage0.addView(label1);
View panel6 = (View) getPanel6View((UMActivity)context,binderGroup);
viewPage0.addView(panel6);
View panel7 = (View) getPanel7View((UMActivity)context,binderGroup);
viewPage0.addView(panel7);
button0 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON0
,"border-bottom-width","1"
,"font-pressed-color","#00a1ea"
,"margin-right","10"
,"height","44"
,"border-right-color","#ec5f1a"
,"font-size","20"
,"value","退出登录"
,"border-right-width","1"
,"border-left-width","1"
,"halign","center"
,"border-radius","5"
,"width","fill"
,"border-bottom-color","#ec5f1a"
,"border-top-width","1"
,"border-left-color","#ec5f1a"
,"border-top-color","#ec5f1a"
,"color","#ffffff"
,"background","#ec5f1a"
,"layout-type","linear"
,"margin-left","10"
,"onclick","action:button0_onclick"
,"font-family","default"
,"margin-top","20"
,"valign","center"
);
viewPage0.addView(button0);

return viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup) {
About = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_ABOUT
,"halign","center"
,"height","fill"
,"layout","vbox"
,"width","fill"
,"controller","AboutController"
,"valign","TOP"
,"namespace","com.lionbridge.customer"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup);
About.addView(viewPage0);

return (UMWindow)About;
}

	
	public void actionPanel0_onclick(View control, UMEventArgs args) {
    String actionid = "panel0_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "this.openVoucher()",UMActivity.getViewId(control),args);
}
public void actionButton0_onclick(View control, UMEventArgs args) {
    String actionid = "button0_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "this.login()",UMActivity.getViewId(control),args);
}
public void actionPanel3_onclick(View control, UMEventArgs args) {
    String actionid = "panel3_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "this.openRepassword()",UMActivity.getViewId(control),args);
}
public void actionPanel2_onclick(View control, UMEventArgs args) {
    String actionid = "panel2_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "this.openAddress()",UMActivity.getViewId(control),args);
}
public void actionPanel4_onclick(View control, UMEventArgs args) {
    String actionid = "panel4_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "this.openOpinionDetail()",UMActivity.getViewId(control),args);
}
public void actionImagebutton1_onclick(View control, UMEventArgs args) {
    String actionid = "imagebutton1_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "this.closeAbout()",UMActivity.getViewId(control),args);
}
public void actionPanel5_onclick(View control, UMEventArgs args) {
    String actionid = "panel5_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "this.openAboutDetail()",UMActivity.getViewId(control),args);
}


}
