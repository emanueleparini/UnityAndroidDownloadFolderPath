
# Unity Android Library

This project contains the library for Unity for get the path of Android Download directory and send to Unity Script C#



## Use

Compile project nd export AAR files, then add to Plugin/Android folder into Unity Assets


## Unity Code
```
if (Application.platform == RuntimePlatform.Android)
{
    AndroidJavaObject alert = new AndroidJavaObject("lele.parini.mylibrary.MYLibrary");         
    Debug.Log(alert.Call<string>("getDownloadFolder"));
}
```

