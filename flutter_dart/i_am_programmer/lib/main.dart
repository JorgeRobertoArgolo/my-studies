import 'package:flutter/material.dart';

void main() {
  runApp(
      MaterialApp(
        home: Scaffold(
          appBar: AppBar(
            title: Text(
                'I am a programmer',
                style: TextStyle(
                  color: Colors.white,
                  fontWeight: FontWeight.bold,
                ),
            ),
            centerTitle: true,
            backgroundColor: Color(0xFF4A5D73),

          ),

          backgroundColor: Color(0xFFF1EDE2),

          body: Center(
            child: Image.asset('images/app_image_main.png'),
          ),

        )
      )
  );
}
