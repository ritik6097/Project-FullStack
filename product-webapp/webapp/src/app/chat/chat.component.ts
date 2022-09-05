import { Component, OnInit, OnDestroy } from '@angular/core';
import { NgForm } from '@angular/forms';
import { WebSocketService } from '../service/web-socket.service';
import { ChatMessageDto } from '../models/chatMessageDto';
import { Router } from '@angular/router';

@Component({
  selector: 'app-chat',
  templateUrl: './chat.component.html',
  styleUrls: ['./chat.component.css']
})
export class ChatComponent implements OnInit, OnDestroy {
  msg = localStorage.getItem('user-email')
no = Math.floor((Math.random() * 10) % 5);

  imgsList = ["https://cdn-icons-png.flaticon.com/512/3177/3177440.png",
  "https://cdn-icons-png.flaticon.com/512/552/552848.png",
  "https://cdn-icons-png.flaticon.com/512/706/706807.png",
  "https://cdn-icons-png.flaticon.com/512/2207/2207595.png",
  "https://cdn-icons-png.flaticon.com/512/4140/4140048.png",
  "https://cdn-icons-png.flaticon.com/512/1177/1177568.png"
]
  constructor(public webSocketService: WebSocketService, private router:Router) { }

  ngOnInit(): void {
    this.webSocketService.openWebSocket();
  }

  ngOnDestroy(): void {
    this.webSocketService.closeWebSocket();
  }

  sendMessage(sendForm: NgForm) {
    const chatMessageDto = new ChatMessageDto(sendForm.value.user, sendForm.value.message);
    this.webSocketService.sendMessage(chatMessageDto);
    sendForm.controls['message'].reset();
  }
}
