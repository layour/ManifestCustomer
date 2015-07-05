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

public abstract class AboutDetailActivity extends UMWindowActivity {

	protected UMWindow AboutDetail = null;
protected XVerticalLayout viewPage0 = null;
protected XHorizontalLayout navigatorbar0 = null;
protected UMImageButton imagebutton0 = null;
protected UMLabel label0 = null;
protected UMScrollView Scrollview_panel0 = null;
protected XVerticalLayout panel0 = null;
protected UMLabel label1 = null;
protected UMLabel label3 = null;

	
	protected final static int ID_ABOUTDETAIL = 1687175417;
protected final static int ID_VIEWPAGE0 = 130471075;
protected final static int ID_NAVIGATORBAR0 = 1572888960;
protected final static int ID_IMAGEBUTTON0 = 1126753876;
protected final static int ID_LABEL0 = 1697492868;
protected final static int ID_SCROLLVIEW_PANEL0 = 1942061651;
protected final static int ID_PANEL0 = 613968700;
protected final static int ID_LABEL1 = 432183634;
protected final static int ID_LABEL3 = 760624576;

	
	
	@Override
	public String getControllerName() {
		return "AboutDetailController";
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
		  idmap.put("AboutDetail",ID_ABOUTDETAIL);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("navigatorbar0",ID_NAVIGATORBAR0);
  idmap.put("imagebutton0",ID_IMAGEBUTTON0);
  idmap.put("label0",ID_LABEL0);
  idmap.put("Scrollview_panel0",ID_SCROLLVIEW_PANEL0);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("label1",ID_LABEL1);
  idmap.put("label3",ID_LABEL3);

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
,"title","关于我们"
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

return navigatorbar0;
}
public View getPanel0View(final UMActivity context,IBinderGroup binderGroup) {
panel0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL0
,"padding-left","10"
,"padding-right","10"
,"padding-top","5"
,"halign","center"
,"weight","1"
,"height","0"
,"width","fill"
,"background","#ffffff"
,"layout-type","linear"
,"valign","TOP"
,"padding-bottom","10"
);
label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL1
,"halign","center"
,"innerhtml","<html><body><h3>服务保障</h3></body></html>"
,"height","wrap"
,"color","#000000"
,"heightwrap","20.0"
,"layout-type","linear"
,"background","#ffffff"
,"font-size","14"
,"width","fill"
,"font-family","default"
,"valign","center"
);
panel0.addView(label1);
label3 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL3
,"innerhtml","<html><body><h4>实力雄厚</h4><p style=\"color:#686868;\">&nbsp;&nbsp;&nbsp;&nbsp;天津狮桥国际物流公司是狮桥融资租赁（中国）有限公司（集团）全资子公司。集团净资产12亿人民币，总资产40亿人民币，是中国知名融资租赁公司。2014年9月集团获全球顶级基金贝恩资本（Bain Capital）投资。<br/>&nbsp;&nbsp;&nbsp;&nbsp;天津狮桥国际物流公司是中国物流与采购联合会医药物流分会副会长，中国物流与采购联合会物流金融专业委员会副主任单位，医药物流国家标准试点企业，药品冷链物流动作国家标准试点企业。<br/>&nbsp;&nbsp;&nbsp;&nbsp;狮桥集团董事长兼CEO万钧先生荣获物流行业多项荣誉。</p><h4>安全可控</h4><p style=\"color:#686868;\">&nbsp;&nbsp;&nbsp;&nbsp;狮桥超级车队全部车辆为自有车辆，不使用社会动力。<br/>&nbsp;&nbsp;&nbsp;&nbsp;狮桥超级车队全部车辆为全新采购一流品牌。<br/>&nbsp;&nbsp;&nbsp;&nbsp;每车货物投保300万货运险。<br/>&nbsp;&nbsp;&nbsp;&nbsp;基于可视化物流的全程监控管理系统。</p><h4>时效保证</h4><p style=\"color:#686868;\">&nbsp;&nbsp;&nbsp;&nbsp;沿途备用车辆确保运输不中断。<br/>&nbsp;&nbsp;&nbsp;&nbsp;约定的装货空厢到车时间每迟到一小时，赔偿100元（*注1）。<br/>&nbsp;&nbsp;&nbsp;&nbsp;约定的装货满厢到车时间每迟到一小时，赔偿200元（*注2）。</p><h4>运力充沛</h4><p style=\"color:#686868;\">&nbsp;&nbsp;&nbsp;&nbsp;狮桥超级车队拥有数百台全新车辆。<br/>&nbsp;&nbsp;&nbsp;&nbsp;集团最大的金融实力支持随时新增运力。</p><h4>经济高效</h4><p style=\"color:#686868;\">&nbsp;&nbsp;&nbsp;&nbsp;顶级服务，实惠价格。<br/>&nbsp;&nbsp;&nbsp;&nbsp;只需在发车时预付50%，其余货款在到货后付清。<br/>&nbsp;&nbsp;&nbsp;&nbsp;全部下单、发运、收货、支付可在网站、手机APP上完成。<br/>&nbsp;&nbsp;&nbsp;&nbsp;提供全额增值锐专用发票。<br/>&nbsp;&nbsp;&nbsp;&nbsp;立刻下单，体验狮桥超级车队的超级服务！</p></body></html>"
,"halign","left"
,"widthwrap","300.0"
,"width","wrap"
,"type","multiline"
,"height","wrap"
,"color","#000000"
,"heightwrap","399.0"
,"layout-type","linear"
,"background","#ffffff"
,"font-size","14"
,"font-family","default"
,"valign","top"
);
panel0.addView(label3);

return panel0;
}
public View getScrollview_panel0View(final UMActivity context,IBinderGroup binderGroup) {
Scrollview_panel0 = (UMScrollView)ThirdControl.createControl(new UMScrollView(context),ID_SCROLLVIEW_PANEL0
,"vscrollenabled","always"
,"layout-type","linear"
,"width","fill"
,"hscrollenabled","disabled"
);
View panel0 = (View) getPanel0View((UMActivity)context,binderGroup);
Scrollview_panel0.addView(panel0);

return Scrollview_panel0;
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
View Scrollview_panel0 = (View) getScrollview_panel0View((UMActivity)context,binderGroup);
viewPage0.addView(Scrollview_panel0);

return viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup) {
AboutDetail = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_ABOUTDETAIL
,"halign","center"
,"height","fill"
,"layout","vbox"
,"width","fill"
,"controller","AboutDetailController"
,"valign","TOP"
,"namespace","com.lionbridge.customer"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup);
AboutDetail.addView(viewPage0);

return (UMWindow)AboutDetail;
}

	
	public void actionImagebutton0_onclick(View control, UMEventArgs args) {
    String actionid = "imagebutton0_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "this.closeAboutDetail()",UMActivity.getViewId(control),args);
}


}
