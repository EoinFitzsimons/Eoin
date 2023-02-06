<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class FrmLogin
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()> _
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Required by the Windows Form Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Windows Form Designer
    'It can be modified using the Windows Form Designer.  
    'Do not modify it using the code editor.
    <System.Diagnostics.DebuggerStepThrough()> _
    Private Sub InitializeComponent()
        Me.components = New System.ComponentModel.Container
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(FrmLogin))
        Me.BtnLogin = New System.Windows.Forms.Button
        Me.LblUsernames = New System.Windows.Forms.Label
        Me.LblPassword = New System.Windows.Forms.Label
        Me.TxtPassword = New System.Windows.Forms.TextBox
        Me.CmbUsers = New System.Windows.Forms.ComboBox
        Me.ImgWarning1 = New System.Windows.Forms.PictureBox
        Me.TmrCountdown = New System.Windows.Forms.Timer(Me.components)
        Me.LblCountdown = New System.Windows.Forms.Label
        Me.ImgWarning2 = New System.Windows.Forms.PictureBox
        Me.ImgWarning3 = New System.Windows.Forms.PictureBox
        Me.ImgWarning4 = New System.Windows.Forms.PictureBox
        CType(Me.ImgWarning1, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.ImgWarning2, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.ImgWarning3, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.ImgWarning4, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'BtnLogin
        '
        Me.BtnLogin.BackColor = System.Drawing.Color.White
        Me.BtnLogin.Font = New System.Drawing.Font("Orbitron Medium", 8.25!)
        Me.BtnLogin.ForeColor = System.Drawing.Color.SteelBlue
        Me.BtnLogin.Location = New System.Drawing.Point(410, 431)
        Me.BtnLogin.Margin = New System.Windows.Forms.Padding(3, 4, 3, 4)
        Me.BtnLogin.Name = "BtnLogin"
        Me.BtnLogin.Size = New System.Drawing.Size(160, 37)
        Me.BtnLogin.TabIndex = 0
        Me.BtnLogin.Text = "Login"
        Me.BtnLogin.UseVisualStyleBackColor = False
        '
        'LblUsernames
        '
        Me.LblUsernames.AutoSize = True
        Me.LblUsernames.BackColor = System.Drawing.Color.White
        Me.LblUsernames.Font = New System.Drawing.Font("Orbitron Medium", 8.25!)
        Me.LblUsernames.ForeColor = System.Drawing.Color.SteelBlue
        Me.LblUsernames.Location = New System.Drawing.Point(283, 107)
        Me.LblUsernames.Name = "LblUsernames"
        Me.LblUsernames.Size = New System.Drawing.Size(82, 14)
        Me.LblUsernames.TabIndex = 1
        Me.LblUsernames.Text = "Select User"
        '
        'LblPassword
        '
        Me.LblPassword.AutoSize = True
        Me.LblPassword.BackColor = System.Drawing.Color.White
        Me.LblPassword.Font = New System.Drawing.Font("Orbitron Medium", 8.25!)
        Me.LblPassword.ForeColor = System.Drawing.Color.SteelBlue
        Me.LblPassword.Location = New System.Drawing.Point(288, 283)
        Me.LblPassword.Name = "LblPassword"
        Me.LblPassword.Size = New System.Drawing.Size(73, 14)
        Me.LblPassword.TabIndex = 2
        Me.LblPassword.Text = "Password"
        '
        'TxtPassword
        '
        Me.TxtPassword.BackColor = System.Drawing.Color.White
        Me.TxtPassword.Font = New System.Drawing.Font("Orbitron Medium", 8.25!)
        Me.TxtPassword.ForeColor = System.Drawing.Color.SteelBlue
        Me.TxtPassword.Location = New System.Drawing.Point(400, 280)
        Me.TxtPassword.Name = "TxtPassword"
        Me.TxtPassword.PasswordChar = Global.Microsoft.VisualBasic.ChrW(63)
        Me.TxtPassword.Size = New System.Drawing.Size(285, 21)
        Me.TxtPassword.TabIndex = 3
        Me.TxtPassword.Text = "Password"
        '
        'CmbUsers
        '
        Me.CmbUsers.BackColor = System.Drawing.Color.White
        Me.CmbUsers.Font = New System.Drawing.Font("Orbitron Medium", 8.25!)
        Me.CmbUsers.ForeColor = System.Drawing.Color.SteelBlue
        Me.CmbUsers.FormattingEnabled = True
        Me.CmbUsers.Location = New System.Drawing.Point(400, 105)
        Me.CmbUsers.Name = "CmbUsers"
        Me.CmbUsers.Size = New System.Drawing.Size(285, 22)
        Me.CmbUsers.TabIndex = 4
        '
        'ImgWarning1
        '
        Me.ImgWarning1.BackColor = System.Drawing.Color.Transparent
        Me.ImgWarning1.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Center
        Me.ImgWarning1.Image = CType(resources.GetObject("ImgWarning1.Image"), System.Drawing.Image)
        Me.ImgWarning1.Location = New System.Drawing.Point(741, 371)
        Me.ImgWarning1.Name = "ImgWarning1"
        Me.ImgWarning1.Size = New System.Drawing.Size(229, 187)
        Me.ImgWarning1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom
        Me.ImgWarning1.TabIndex = 5
        Me.ImgWarning1.TabStop = False
        '
        'TmrCountdown
        '
        Me.TmrCountdown.Interval = 1000
        '
        'LblCountdown
        '
        Me.LblCountdown.AutoSize = True
        Me.LblCountdown.Font = New System.Drawing.Font("Orbitron Medium", 8.25!)
        Me.LblCountdown.ForeColor = System.Drawing.Color.White
        Me.LblCountdown.Location = New System.Drawing.Point(410, 472)
        Me.LblCountdown.Name = "LblCountdown"
        Me.LblCountdown.Size = New System.Drawing.Size(147, 14)
        Me.LblCountdown.TabIndex = 6
        Me.LblCountdown.Text = "20 Seconds  To Log In"
        Me.LblCountdown.TextAlign = System.Drawing.ContentAlignment.TopCenter
        '
        'ImgWarning2
        '
        Me.ImgWarning2.BackColor = System.Drawing.Color.Transparent
        Me.ImgWarning2.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Center
        Me.ImgWarning2.Image = CType(resources.GetObject("ImgWarning2.Image"), System.Drawing.Image)
        Me.ImgWarning2.Location = New System.Drawing.Point(12, 371)
        Me.ImgWarning2.Name = "ImgWarning2"
        Me.ImgWarning2.Size = New System.Drawing.Size(229, 187)
        Me.ImgWarning2.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom
        Me.ImgWarning2.TabIndex = 7
        Me.ImgWarning2.TabStop = False
        '
        'ImgWarning3
        '
        Me.ImgWarning3.BackColor = System.Drawing.Color.Transparent
        Me.ImgWarning3.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Center
        Me.ImgWarning3.Image = CType(resources.GetObject("ImgWarning3.Image"), System.Drawing.Image)
        Me.ImgWarning3.Location = New System.Drawing.Point(12, 12)
        Me.ImgWarning3.Name = "ImgWarning3"
        Me.ImgWarning3.Size = New System.Drawing.Size(229, 187)
        Me.ImgWarning3.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom
        Me.ImgWarning3.TabIndex = 8
        Me.ImgWarning3.TabStop = False
        '
        'ImgWarning4
        '
        Me.ImgWarning4.BackColor = System.Drawing.Color.Transparent
        Me.ImgWarning4.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Center
        Me.ImgWarning4.Image = CType(resources.GetObject("ImgWarning4.Image"), System.Drawing.Image)
        Me.ImgWarning4.Location = New System.Drawing.Point(741, 12)
        Me.ImgWarning4.Name = "ImgWarning4"
        Me.ImgWarning4.Size = New System.Drawing.Size(229, 187)
        Me.ImgWarning4.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom
        Me.ImgWarning4.TabIndex = 9
        Me.ImgWarning4.TabStop = False
        '
        'FrmLogin
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(8.0!, 14.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackColor = System.Drawing.Color.SteelBlue
        Me.ClientSize = New System.Drawing.Size(982, 570)
        Me.Controls.Add(Me.ImgWarning4)
        Me.Controls.Add(Me.ImgWarning3)
        Me.Controls.Add(Me.ImgWarning2)
        Me.Controls.Add(Me.LblCountdown)
        Me.Controls.Add(Me.ImgWarning1)
        Me.Controls.Add(Me.CmbUsers)
        Me.Controls.Add(Me.TxtPassword)
        Me.Controls.Add(Me.LblPassword)
        Me.Controls.Add(Me.LblUsernames)
        Me.Controls.Add(Me.BtnLogin)
        Me.Font = New System.Drawing.Font("Orbitron Medium", 8.25!)
        Me.Icon = CType(resources.GetObject("$this.Icon"), System.Drawing.Icon)
        Me.Margin = New System.Windows.Forms.Padding(3, 4, 3, 4)
        Me.Name = "FrmLogin"
        Me.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen
        Me.Text = "Login"
        CType(Me.ImgWarning1, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.ImgWarning2, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.ImgWarning3, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.ImgWarning4, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents BtnLogin As System.Windows.Forms.Button
    Friend WithEvents LblUsernames As System.Windows.Forms.Label
    Friend WithEvents LblPassword As System.Windows.Forms.Label
    Friend WithEvents TxtPassword As System.Windows.Forms.TextBox
    Friend WithEvents CmbUsers As System.Windows.Forms.ComboBox
    Friend WithEvents ImgWarning1 As System.Windows.Forms.PictureBox
    Friend WithEvents TmrCountdown As System.Windows.Forms.Timer
    Friend WithEvents LblCountdown As System.Windows.Forms.Label
    Friend WithEvents ImgWarning2 As System.Windows.Forms.PictureBox
    Friend WithEvents ImgWarning3 As System.Windows.Forms.PictureBox
    Friend WithEvents ImgWarning4 As System.Windows.Forms.PictureBox

End Class
