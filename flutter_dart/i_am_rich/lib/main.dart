import 'package:flutter/material.dart';

void main() {
  runApp(
    MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: Text("I am Rich", style: TextStyle(color: Colors.white)),
          backgroundColor: Colors.blueGrey[900],
          centerTitle: true,
        ),

        backgroundColor: Colors.blueGrey,

        body: Center(
          child: Image(
            image: AssetImage('images/rubi.png'),
          ),
        ),
      ),
    ),
  );
}
