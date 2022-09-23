document.getElementById("upload").addEventListener("click",async ()=>{
    let formData = new FormData();           
    formData.append("file", fileupload.files[0]);
    await fetch('./assets', {
      method: "POST", 
      body: formData
    });    
    alert('The file has been uploaded successfully.');
})