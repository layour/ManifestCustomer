//JavaScript Framework 2.0 Code
try{
Type.registerNamespace('com.lionbridge.customer.HomeController');
com.lionbridge.customer.HomeController = function() {
    com.lionbridge.customer.HomeController.initializeBase(this);
    this.initialize();
}
function com$lionbridge$customer$HomeController$initialize(){
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
    
function com$lionbridge$customer$HomeController$evaljs(js){
    eval(js)
}
function com$lionbridge$customer$HomeController$openAbout(sender, args){
	$view.open({
		"viewid" : "com.lionbridge.customer.About",//目标页面（首字母大写）全名，
		"isKeep" : "true"
	});
}
function com$lionbridge$customer$HomeController$openOderQuery(sender, args){
	$view.open({
		"viewid" : "com.lionbridge.customer.OrderQuery",//目标页面（首字母大写）全名，
		"isKeep" : "true"
	});
}
function com$lionbridge$customer$HomeController$openAddressSelect(sender, args){
	$view.openPicker({
		"okaction" : "ok()", //确定后执行的JS方法
		"title" : "城市选择",
		"pickercount" : "1",
		"datasource" : {picker : [
			{select : [
				{value : "BJ", content : "北京市"}, 
				{value : "SH", content : "上海市"}, 
				{value : "GZ", content : "广州市"}, 
				{value : "CD", content : "成都市"}
			]}
		]},
		"picker2binder" : "name" //Context字段名，存放选中项的value
	})
}
com.lionbridge.customer.HomeController.prototype = {
    openAddressSelect : com$lionbridge$customer$HomeController$openAddressSelect,
    openOderQuery : com$lionbridge$customer$HomeController$openOderQuery,
    openAbout : com$lionbridge$customer$HomeController$openAbout,
    initialize : com$lionbridge$customer$HomeController$initialize,
    evaljs : com$lionbridge$customer$HomeController$evaljs
};
com.lionbridge.customer.HomeController.registerClass('com.lionbridge.customer.HomeController',UMP.UI.Mvc.Controller);
}catch(e){$e(e);}
