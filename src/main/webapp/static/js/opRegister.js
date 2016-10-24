/**
 * Created by Administrator on 2016/9/7.
 */
$(function(){

        if(registerMessage!=""){
            alert(registerMessage);
        }


   $('#bornDate').bind('click',function(){
       WdatePicker({dateFmt:"yyyy/MM/dd"});
   });
    $('#addressCityCode').bind('change',function () {
       $.getJSON("/sys/rest/findAreaByParentCode",{parentCode:$(this).val()},function (json) {
          //console.info(JSON.stringify(json));
            $('#addressAreaCode').empty();
           if(json.code==1){
               for(var i=0;i<json.obj.length;i++){
                   $('#addressAreaCode').append("<option value='"+json.obj[i].code+"'>"+json.obj[i].name+"</option>");
               }
           }else{
               alert(json.message);
           }
       });
    });

    $('#addressProvinceCode').bind('click',function (){
        $.getJSON("/sys/rest/findAreaByParentCode",{parentCode:$(this).val() },function (json) {
            if(json.code==1){
                $('#addressCityCode').empty();
                for(var i=0;i<json.obj.length;i++){
                    $('#addressCityCode').append("<option value='"+json.obj[i].code+"'>"+json.obj[i].name+"</option>");
                }
                
                $.getJSON("/sys/rest/findAreaByParentCode",{parentCode:$('addressCityCode').val() },function (json) {
                    if (json.code == 1) {
                        $('#addressAreaCode').empty();
                        for (var i = 0; i < json.obj.length; i++) {
                            $('#addressAreaCode').append("<option value='" + json.obj[i].code + "'>" + json.obj[i].name + "</option>");
                        }
                    } else {
                        alert(json.message);
                    }
                });
            }else{
                alert(json.message);
            }
        });
    });
    $('#allergensCode4').click(function () {
        if($('#allergensCode4').is(":checked")){
            $('#otherAllergens').show();
        }else{
            $('#otherAllergens').hide();
            $('#otherAllergens').val();
        }
    });
});