//JavaScript Framework 2.0 Code
try{
Type.registerNamespace('com.lionbridge.customer.OrderListController');
com.lionbridge.customer.OrderListController = function() {
    com.lionbridge.customer.OrderListController.initializeBase(this);
    this.initialize();
}
function com$lionbridge$customer$OrderListController$initialize(){
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
    
function com$lionbridge$customer$OrderListController$evaljs(js){
    eval(js)
}
function com$lionbridge$customer$OrderListController$closeOrderList(sender, args){
	$view.close();
}
function com$lionbridge$customer$OrderListController$loadOrder(sender, args){
	var json = {
		list : [{
			count : "3厢",
			line : "上海市-北京市",
			time : "8:00-18:00",
			date : "2015-07-08",
			money : "￥7000"
		}, {
			count : "5厢",
			line : "上海市-北京市",
			time : "8:00-18:00",
			date : "2015-07-08",
			money : "￥9400"
		}, {
			count : "2厢",
			line : "北京市-上海市",
			time : "8:00-18:00",
			date : "2015-07-08",
			money : "￥7600"
		}]
	}
	$ctx.push(json);
}
function com$lionbridge$customer$OrderListController$openOneKeyOrder(sender, args){
	$view.open({
		"viewid" : "com.lionbridge.customer.OneKeyOrder",//目标页面（首字母大写）全名，
		"isKeep" : "true"
	});
}
function com$lionbridge$customer$OrderListController$openAddressSelect(sender, args){
	com.lionbridge.customer.GlobalFunction.openAddressPicker();
}
com.lionbridge.customer.OrderListController.prototype = {
    openAddressSelect : com$lionbridge$customer$OrderListController$openAddressSelect,
    openOneKeyOrder : com$lionbridge$customer$OrderListController$openOneKeyOrder,
    loadOrder : com$lionbridge$customer$OrderListController$loadOrder,
    closeOrderList : com$lionbridge$customer$OrderListController$closeOrderList,
    initialize : com$lionbridge$customer$OrderListController$initialize,
    evaljs : com$lionbridge$customer$OrderListController$evaljs
};
com.lionbridge.customer.OrderListController.registerClass('com.lionbridge.customer.OrderListController',UMP.UI.Mvc.Controller);
}catch(e){$e(e);}
