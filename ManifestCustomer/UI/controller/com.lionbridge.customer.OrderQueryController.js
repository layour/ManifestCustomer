//JavaScript Framework 2.0 Code
try{
Type.registerNamespace('com.lionbridge.customer.OrderQueryController');
com.lionbridge.customer.OrderQueryController = function() {
    com.lionbridge.customer.OrderQueryController.initializeBase(this);
    this.initialize();
}
function com$lionbridge$customer$OrderQueryController$initialize(){
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
    
function com$lionbridge$customer$OrderQueryController$evaljs(js){
    eval(js)
}
function com$lionbridge$customer$OrderQueryController$closeOrderQuery(sender, args){
	$view.close();
}
function com$lionbridge$customer$OrderQueryController$changeToggle(sender, args){
	var value = $id("togglebuttongroup1").get("selectedvalue");
	if(value == 0){
		$id("flipperdefine0").set("viewindex", value);
	} else if(value == 1){
		$id("flipperdefine0").set("viewindex", value);
	}
}
function com$lionbridge$customer$OrderQueryController$previousflipper(sender, args){
	var index = $id("flipperdefine0").get("viewindex");
	$id("togglebuttongroup1").set("selectedvalue", index);
}
function com$lionbridge$customer$OrderQueryController$nextflipper(sender, args){
	var index = $id("flipperdefine0").get("viewindex");
	$id("togglebuttongroup1").set("selectedvalue", index);
}
function com$lionbridge$customer$OrderQueryController$loadOrder(sender, args){
	var json = {
		list : [{
			status : "正在运输",
			orderno : "订单号：100000663",
			line : "专线名称：北京市-上海市",
			count : "定舱数量：1",
			money : "订单金额：￥7000"
		}, {
			status : "正在运输",
			orderno : "订单号：100000664",
			line : "专线名称：北京市-上海市",
			count : "定舱数量：2",
			money : "订单金额：￥6000"
		}, {
			status : "正在运输",
			orderno : "订单号：100000665",
			line : "专线名称：北京市-上海市",
			count : "定舱数量：2",
			money : "订单金额：￥7000"
		}]
	}
	$ctx.push(json);
}
com.lionbridge.customer.OrderQueryController.prototype = {
    loadOrder : com$lionbridge$customer$OrderQueryController$loadOrder,
    nextflipper : com$lionbridge$customer$OrderQueryController$nextflipper,
    previousflipper : com$lionbridge$customer$OrderQueryController$previousflipper,
    changeToggle : com$lionbridge$customer$OrderQueryController$changeToggle,
    closeOrderQuery : com$lionbridge$customer$OrderQueryController$closeOrderQuery,
    initialize : com$lionbridge$customer$OrderQueryController$initialize,
    evaljs : com$lionbridge$customer$OrderQueryController$evaljs
};
com.lionbridge.customer.OrderQueryController.registerClass('com.lionbridge.customer.OrderQueryController',UMP.UI.Mvc.Controller);
}catch(e){$e(e);}
