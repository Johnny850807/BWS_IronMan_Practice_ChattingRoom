# BWS_IronMan_Practice_ChattingRoom
城市鐵男─程式鐵男

**簽到區**

- 水球簽到 
- 阿宗師簽到
- 傑哥簽到
- 老師簽到
- 花柳齋簽到

## 組長廣播頻道
### 資訊接收以及討論都在Github 上面完成，組員要自己頻繁來這兒逛逛，有問題在issue討論，進度管理分工在Project規劃，才能記錄完善提升效率，建立一個完善的合作制度後─各司其職，專研特優我們也是辦得到的！！



## Requirements Analyze

# Android 前端 Two Activities

### 歡迎登入頁面

	1. 顯示歡迎訊息
    2. 給使用者輸入帳號與密碼 以及登入按鈕
    1. 如果輸入錯誤，顯示快顯訊息。
    4. 可以使用匿名登入 (使用者會顯示為匿名，而且不能存取聊天紀錄)  -- test line -- -- test line -- -- test line -- -- test line -- -- test line -- -- test line -- -- test line -- -- test line -- 
    
### 註冊帳密頁面

	1. 有輸入暱稱、帳號、密碼的三個欄位。
    2. 確認帳號暱稱無誤無重複之後提交並註冊，否則顯示錯誤訊息，註冊後進入到**等候房間列表**畫面。
    
### 聊天室頁面

	1. 用一個webview裝進聊天室畫面。


## 網頁前端 兩個 Webview 

### 等候房間列表

	1. 顯示所有已被建立的房間。
    2. 使用者可以點擊進入房間。
    3. 使用者可以自行建立房間，但要輸入房名跟主題，建立房間後要把他傳入房間頁面。
    
### 房內視窗

	1. 點選按鈕"Leave"可以離開聊天室(若是房主則顯示"Close Room")。
    2. 使用者可以打字、傳送訊息以及接收聊天訊息。
    3. 每當有使用者離開，要顯示訊息通知大家。
