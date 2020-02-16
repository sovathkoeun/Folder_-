import 'package:flutter/material.dart';

void main () => runApp(
  MaterialApp(
    debugShowCheckedModeBanner: false,
    home: Scaffold(
      appBar: AppBar(
        title: Text("Flutter for reviews"),
        actions: <Widget>[
          Image.network(
            "https://upload.wikimedia.org/wikipedia/en/thumb/5/56/Real_Madrid_CF.svg/1200px-Real_Madrid_CF.svg.png",
          )
        ],
      ),
      body: Center(
        child: Text("Data!"),
      ),
    ),
  ),
);