Public Class FrmAddRecords
    Dim studentname As String
    Dim Assignment1 As Integer
    Dim Assignment2 As Integer
    Dim Assignment3 As Integer
    Dim Exam As Integer
    Dim allmarks As Integer
    Dim CAO As Double
    Dim Grade As String
    Private Sub _Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles BtnAdd.Click
        On Error Resume Next 'Stops program crashing'
        FileOpen(1, My.Application.Info.DirectoryPath & "\results.dat", OpenMode.Append)
        studentname = InputBox("Enter name(or click cancel to stop):")
1:      Assignment1 = (InputBox("Enter a mark between 1 and 20", "Assignment1"))
2:      Assignment2 = (InputBox("Enter a mark between 1 and 20", "Assignment2"))
3:      Assignment3 = (InputBox("Enter a mark between 1 and 30", "Assignment3"))
4:      Exam = (InputBox("Enter a mark between 1 and 30", "Exam"))

        allmarks = Assignment1 + Assignment2 + Assignment3 + Exam
        

        If allmarks >= 80 Then
            Grade = "D"
            CAO = 50
        End If
        If (allmarks >= 65 And allmarks < 80) Then
            Grade = "M"
            CAO = 33.33
        End If
        If (allmarks >= 50 And allmarks < 65) Then
            Grade = "P"
            CAO = 16.67
        End If
        If allmarks < 50 Then
            Grade = "U"
            CAO = 0
        End If

        WriteLine(1, studentname, Assignment1, Assignment2, Assignment3, Exam, Grade, CAO)
    End Sub
    Private Sub BtnMenu1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles BtnMenu1.Click
        Me.Hide()
        FrmMenu.Show()
    End Sub
End Class
