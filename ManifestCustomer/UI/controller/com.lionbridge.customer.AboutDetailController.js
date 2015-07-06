//JavaScript Framework 2.0 Code
try{
Type.registerNamespace('com.lionbridge.customer.AboutDetailController');
com.lionbridge.customer.AboutDetailController = function() {
    com.lionbridge.customer.AboutDetailController.initializeBase(this);
    this.initialize();
}
function com$lionbridge$customer$AboutDetailController$initialize(){
    //you can programing by $ctx API
    //get the context data through $ctx.get()
    //set the context data through $ctx.push(json)
    //set the field of the context through $ctx.put(fieldName, fieldValue)
    //get the parameter of the context through $ctx.param(parameterName)
    //Demo Code:
    //    var str = $ctx.getString();      //获取当前Context对应的字符串
    //    alert($ctx.getString())          //alert当前Context对应的字符串
    //    var json = $ctx.getJSONObject(); //获取当前Context，返回值为json
    //    json["x"] = "a";        //为当前json增加字段
    //    json["y"] = [];           //为当前json增加数组
    //    $ctx.push(json);            //设置context，并自动调用数据绑定
    //    
    //    put方法需手动调用databind()
    //    var x = $ctx.get("x");    //获取x字段值
    //    $ctx.put("x", "b");     //设置x字段值
    //    $ctx.put("x", "b");     //设置x字段值
    //    $ctx.databind();            //调用数据绑定才能将修改的字段绑定到控件上
    //    var p1 = $param.getString("p1");   //获取参数p2的值，返回一个字符串
    //    var p2 = $param.getJSONObject("p2");   //获取参数p3的值，返回一个JSON对象
    //    var p3 = $param.getJSONArray("p3");   //获取参数p1的值，返回一个数组
    
    //your initialize code below...
    
}
    
function com$lionbridge$customer$AboutDetailController$evaljs(js){
    eval(js)
}
function com$lionbridge$customer$AboutDetailController$closeAboutDetail(sender, args){
	$view.close();
}
function com$lionbridge$customer$AboutDetailController$loadAboutDetail(sender, args){
	var json = {
		list : [{
			name : "张三",
			phone : "13687878536",
			address : "北京市昌平区回龙观",
			detail : "和谐家园二区12号楼6单元"
		}, {
			name : "李四",
			phone : "13687873236",
			address : "北京市昌平区回龙观",
			detail : "和谐家园二区12号楼6单元"
		}, {
			name : "王五",
			phone : "13687845536",
			address : "北京市昌平区回龙观",
			detail : "和谐家园二区12号楼6单元"
		}]
	}
	$ctx.push(json);
}
function com$lionbridge$customer$AboutDetailController$loadText(sender, args){
	var context1 = "      天津狮桥国际物流公司是狮桥融资租赁（中国）有限公司（集团）全资子公司。集团净资产12亿人民币，总资产40亿人民币，是中国知名融资租赁公司。2014年9月集团获全球顶级基金贝恩资本（Bain Capital）投资。\n      天津狮桥国际物流公司是中国物流与采购联合会医药物流分会副会长，中国物流与采购联合会物流金融专业委员会副主任单位，医药物流国家标准试点企业，药品冷链物流动作国家标准试点企业。\n      狮桥集团董事长兼CEO万钧先生荣获物流行业多项荣誉。";
	var context2 = "      狮桥超级车队全部车辆为自有车辆，不使用社会动力。\n      狮桥超级车队全部车辆为全新采购一流品牌。\n      每车货物投保300万货运险。\n      基于可视化物流的全程监控管理系统。";
	var context3 = "      沿途备用车辆确保运输不中断。\n      约定的装货空厢到车时间每迟到一小时，赔偿100元（*注1）。\n      约定的装货满厢到车时间每迟到一小时，赔偿200元（*注2）。";
	var context4 = "      狮桥超级车队拥有数百台全新车辆。\n      集团最大的金融实力支持随时新增运力。";
	var context5 = "      顶级服务，实惠价格。\n      只需在发车时预付50%，其余货款在到货后付清。\n      全部下单、发运、收货、支付可在网站、手机APP上完成。\n      提供全额增值锐专用发票。\n      立刻下单，体验狮桥超级车队的超级服务！";
	$id("label3").set("value", context1);
	$id("label5").set("value", context2);
	$id("label7").set("value", context3);
	$id("label9").set("value", context4);
	$id("label11").set("value", context5);
}
com.lionbridge.customer.AboutDetailController.prototype = {
    loadText : com$lionbridge$customer$AboutDetailController$loadText,
    loadAboutDetail : com$lionbridge$customer$AboutDetailController$loadAboutDetail,
    closeAboutDetail : com$lionbridge$customer$AboutDetailController$closeAboutDetail,
    initialize : com$lionbridge$customer$AboutDetailController$initialize,
    evaljs : com$lionbridge$customer$AboutDetailController$evaljs
};
com.lionbridge.customer.AboutDetailController.registerClass('com.lionbridge.customer.AboutDetailController',UMP.UI.Mvc.Controller);
}catch(e){$e(e);}
