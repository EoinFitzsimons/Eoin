Public Class FrmMenu

    Private Sub BtnExit_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles BtnExit.Click
        Me.Hide()
    End Sub

    Private Sub BtnShowRecords_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles BtnShowRecords.Click
        Me.Hide()
        FrmDisplayRecords.Show()
    End Sub

    Private Sub BtnAddRecords_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles BtnAddRecords.Click
        Me.Hide()
        FrmAddRecords.Show()
    End Sub


    
    Private Sub FrmMenu_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load
        On Error Resume Next
        If user = "Eoin" Then
            BtnAddRecords.Visible = True
        End If

        If user = "Guest" Then
            BtnAddRecords.Visible = False
        End If


    End Sub

    Private Sub BtnHelp_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles BtnHelp.Click
        If user = "Eoin" Then MsgBox("Click on Add Records to input student names, marks, and grades. Click Show Records to display this data. Click exit to end the programme. Click Help for this display.")
        If user = "Guest" Then MsgBox("Click Show Records to display student names, marks, and grades. Click exit to end the programme. Click Help for this display.")
    End Sub
End Class