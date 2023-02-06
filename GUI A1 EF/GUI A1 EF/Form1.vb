Public Class FrmLogin
    Dim counter As Byte
    Private Sub BtnLogin_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles BtnLogin.Click
        On Error Resume Next
        If (user = "Eoin" And TxtPassword.Text = "Password") Or (user = "Guest" And TxtPassword.Text = "Password") Then
            Me.Hide()
            FrmMenu.Show()
            MsgBox(user & ", You may enter.")
        Else
            MsgBox("Wrong username or password " & user & "!")
        End If
    End Sub

    Private Sub FrmLogin_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load
        CmbUsers.Items.Add("Eoin")
        CmbUsers.Items.Add("Guest")
        counter = 20
        TmrCountdown.Enabled = True
        ImgWarning1.Visible = False
        ImgWarning2.Visible = False
        ImgWarning3.Visible = False
        ImgWarning4.Visible = False
    End Sub

    Private Sub CmbUsers_SelectedIndexChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles CmbUsers.SelectedIndexChanged
        user = CmbUsers.Text
        TxtPassword.Focus()
    End Sub

    Private Sub TmrCountdown_Tick(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles TmrCountdown.Tick
        counter = counter - 1
        LblCountdown.Text = counter & " Seconds Left."
        LblCountdown.TextAlign = ContentAlignment.MiddleCenter
        If counter = 10 Then
            ImgWarning1.Visible = True
            ImgWarning2.Visible = False
            ImgWarning3.Visible = False
            ImgWarning4.Visible = False
        End If
        If counter = 9 Then
            ImgWarning1.Visible = False
            ImgWarning2.Visible = True
            ImgWarning3.Visible = False
            ImgWarning4.Visible = False
        End If
        If counter = 8 Then
            ImgWarning1.Visible = False
            ImgWarning2.Visible = False
            ImgWarning3.Visible = True
            ImgWarning4.Visible = False
        End If
        If counter = 7 Then
            ImgWarning1.Visible = False
            ImgWarning2.Visible = False
            ImgWarning3.Visible = False
            ImgWarning4.Visible = True
        End If
        If counter = 6 Then
            ImgWarning1.Visible = True
            ImgWarning2.Visible = True
            ImgWarning3.Visible = False
            ImgWarning4.Visible = False
        End If
        If counter = 5 Then
            ImgWarning1.Visible = False
            ImgWarning2.Visible = True
            ImgWarning3.Visible = True
            ImgWarning4.Visible = False
        End If
        If counter = 4 Then
            ImgWarning1.Visible = False
            ImgWarning2.Visible = False
            ImgWarning3.Visible = True
            ImgWarning4.Visible = True
        End If
        If counter = 3 Then
            ImgWarning1.Visible = True
            ImgWarning2.Visible = True
            ImgWarning3.Visible = True
            ImgWarning4.Visible = False
        End If
        If counter = 2 Then
            ImgWarning1.Visible = False
            ImgWarning2.Visible = True
            ImgWarning3.Visible = True
            ImgWarning4.Visible = True
        End If
        If counter = 1 Then
            ImgWarning1.Visible = True
            ImgWarning2.Visible = False
            ImgWarning3.Visible = True
            ImgWarning4.Visible = True
        End If
        If counter = 0 Then
            ImgWarning1.Visible = True
            ImgWarning2.Visible = True
            ImgWarning3.Visible = True
            ImgWarning4.Visible = True
            LblCountdown.Text = "Time is up"
            TmrCountdown.Enabled = False
            Me.Hide()
        End If
    End Sub
End Class
