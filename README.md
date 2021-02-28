# BottomNavigationDanFragment
 Membuat Bottom Navigation pada Android Disertai dengan Fragment 

Menu dalam bottom navigation view dibuat dari menu/menu_bottom.xml seperti kode berikut.

```
<?xml version="1.0" encoding="utf-8"?>
<menu xmlns:android="http://schemas.android.com/apk/res/android">
    <item
        android:id="@+id/menu_home"
        android:icon="@drawable/ic_home"
        android:title="Home"
        />

    <item
        android:id="@+id/menu_scan"
        android:icon="@drawable/ic_scan"
        android:title="Scan"
        />

    <item
        android:id="@+id/menu_profile"
        android:icon="@drawable/ic_profile"
        android:title="Profile"
        />

    <item
        android:id="@+id/menu_notification"
        android:icon="@drawable/ic_notification"
        android:title="Notification"
        />
</menu>
```

Hasil dari bottom navigationnya pada akhirnya sebagai berikut.

![image](https://drive.google.com/uc?export=view&id=1w6BpZ6ZUzHOf9PfTzfdIztzptUk7Z_DN)
