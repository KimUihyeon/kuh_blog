function  libLoadEvnet(str){
    console.log(`
    ->  
    ->  ${str}
    ->  
    `);
}

function _promise(url, data){
    return new Promise(function(resolve, reject){
        $.ajax({
            url : url,
            data : data,
            type : 'post',
            success : function (response){
                resolve(response)
            },
            error : function (error){
                reject(error);
            }
        })
    });
}



let _toastEditor = (function(){

    return {
        editor : null ,
        create : function (elementID){
            this.editor = new tui.Editor({
                el: document.querySelector('#'+elementID),
                viewOnly : true,
                initialEditType: 'markdown',
                previewStyle: 'tab',
                height: '300px',
                hooks : {
                    addImageBlobHook : function (file, callBack){
                        updateImage(file,callBack);
                        return false;
                    }
                }
            });
            return this;
        },
        insertImage : function (orgIamgeName, url){
            let format = '!['+orgIamgeName+']('+url+')';
            this.editor.insertText(format);
            return this;
        },
        htmlToMarkdown : function (html){
            this.editor.setHtml(html);
        }

    }

})();


function updateImage (imageFile, callBack) {

    let formData= new FormData();
    formData.append("image", imageFile);

    $.ajax({
        url: '/file/imageUpload',
        cache: false,
        contentType: false,
        processData: false,
        data: formData,
        type: "post",
        success: function(res) {
            let path = '/resources/upload/' + res.fileList[0].path;
            console.log(path);

            callBack(path, 'test');
        },
        error: function(data) {
            console.log(data);
        }
    });
}

let _summernote = (function (){
    return {

        init : function (elementID){
            $('#'+elementID).summernote({
                tabsize: 2,
                height: 100,
                focus: true,
                lang: 'ko-KR', // default: 'en-US',
                callbacks: {
                    onImageUpload: function(image) {
                        _summernote.imageUpload(elementID, image[0]);
                    }
                }
            });
        },

        imageUpload : function (elementID ,image ){
            console.log(image);
            var data = new FormData();
            data.append("image", image);
            data.append("ttt", 123123);

            $.ajax({
                url: '/file/imageUpload',
                cache: false,
                contentType: false,
                processData: false,
                data: data,
                type: "post",
                success: function(res) {
                    let path = '/resources/upload/' + res.fileList[0].path;
                    console.log(path);
                    var image = $('<img>').attr('src',  path);
                    $('#'+elementID).summernote("insertNode", image[0]);
                },
                error: function(data) {
                    console.log(data);
                }
            });

        }
    }
})();
