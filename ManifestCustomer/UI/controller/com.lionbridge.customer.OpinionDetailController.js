//JavaScript Framework 2.0 Code
try{
Type.registerNamespace('com.lionbridge.customer.OpinionDetailController');
com.lionbridge.customer.OpinionDetailController = function() {
    com.lionbridge.customer.OpinionDetailController.initializeBase(this);
    this.initialize();
}
function com$lionbridge$customer$OpinionDetailController$initialize(){
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
    
function com$lionbridge$customer$OpinionDetailController$evaljs(js){
    eval(js)
}
function com$lionbridge$customer$OpinionDetailController$closeOpinionDetail(sender, args){
	$view.close();
}
function com$lionbridge$customer$OpinionDetailController$loadOpinionDetail(sender, args){
	var json = {
		list : [{
			opinionDesc : "我：这个应用不错！",
			opinionTime : "2015-05月-29 15:31:00",
			ListViewSelector : "0"
		}, {
			opinionDesc : "客服：当然您在功能上有什么好的想法也可以通过这个app反馈给我们哦！我们也是会查看整理的哈~",
			opinionTime : "2015-05月-29 15:31:00",
			ListViewSelector : "1"
		}, {
			opinionDesc : "我：移动互联网化的又一个先例。",
			opinionTime : "2015-05月-29 15:31:00",
			ListViewSelector : "0"
		}]
	}
	$ctx.push(json);
}
com.lionbridge.customer.OpinionDetailController.prototype = {
    loadOpinionDetail : com$lionbridge$customer$OpinionDetailController$loadOpinionDetail,
    closeOpinionDetail : com$lionbridge$customer$OpinionDetailController$closeOpinionDetail,
    initialize : com$lionbridge$customer$OpinionDetailController$initialize,
    evaljs : com$lionbridge$customer$OpinionDetailController$evaljs
};
com.lionbridge.customer.OpinionDetailController.registerClass('com.lionbridge.customer.OpinionDetailController',UMP.UI.Mvc.Controller);
}catch(e){$e(e);}
