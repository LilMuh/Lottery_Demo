<template>
 <div>
   <div class="content-container">
     <div class="content-box">
       <h2>Home</h2>
       <p>Description for the Home section...</p>

     </div>
     <div class="content-box">
       <h2>About Us</h2>
       <p>Description for the About Us section...</p>
       <el-button round class="btn">About us</el-button>
     </div>
     <div class="content-box">
       <h2>Game</h2>
       <p>Description for the Game section...</p>
     </div>
     <div class="content-box">
       <h2>Winners</h2>
       <p>Description for the Winners Us section...</p>
     </div>
     <div class="content-box">
       <h2>Tournament</h2>
       <p>Description for the tournament section...</p>
     </div>
   </div>

 </div>
</template>

<script>
export default {}
</script>

<style>
.content-container {
  display: flex;
  justify-content: space-around;
  padding: 20px;
  /*background: ;*/
}

.content-box {
  width: 18%; /* Adjust the width as per your design */
  padding: 20px;
  background-image: linear-gradient(to bottom, rgba(205, 227, 252, 0.42) 40%, rgba(169, 197, 233, 0.84) 120%); /* Gradient from white to light blue */
  border-radius: 10px;
  box-shadow: 0 4px 8px rgb(163, 163, 163);
  transition: transform 0.3s ease-in-out;
}

.content-box h2 {
  color: #062144;
  margin-bottom: 10px;
}

.content-box p {
  color: #062144;
}

.content-box{
  text-align: center;
}

.content-box .btn{
  background-image: linear-gradient(to bottom, rgba(64, 158, 255, 0.82), #409EFF 120%); /* Gradient from white to light blue */
}

.content-box:hover {
  transform: translateY(-5px); /* Slight lift effect on hover */
}


</style>
