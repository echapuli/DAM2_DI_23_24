   M S B A M L   `   `   `  ����  IngresosGastos%    IngresosGastos.VentanaPrincipal   5   	   \ XPresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35R NWindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35W SPresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35D 9http://schemas.microsoft.com/winfx/2006/xaml/presentation    5   	   R NSystem.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5   	     � Title$  
MainWindow��5   	   $��293.3��6   $	��525��6+    � 
ResizeMode$ NoResize=�67   .��5      � $��	0,0,0,238q�6   .+�5   
   &   System.Windows.Controls.DataGrid  -   5          Name$ DataGridIngresosoGastos��5      $��10,30,9,-229q�64      AutoGenerateColumns .  ��.  ��6J   ��  �� Path$ ListaIngresosGastos�   Columns 5      0  *System.Windows.Controls.DataGridTextColumn  5	      ,  &System.Windows.Controls.DataGridColumn   Width5  /System.Windows.Controls.DataGridLengthConverter$	 100 6%      Header$ FECHA��61      CanUserResize .  1  +System.Windows.Controls.DataGridBoundColumn	   Binding	 6@   �� $ Fecha�6_     5
      $	 200 6%   $ CONCEPTO��61   
   CanUserReorder
 .  	 6C   �� $ Concepto�6e     5      $ 90 6%   $ INGRESO��60   
 .  	 6A   �� $ Ingreso�   	CellStyle 5      �� 5      .�5      ��  �� Property � �� �� Value$ Right=�6U   6e   �� 5       � ��$ Center=�6S   6d   5      5        5      $ 90 6%   $ GASTO��60   
 .  	 6?   �� $ Gasto� 5      �� 5      .�5      ��  � ��$ Right=�6U   6e   �� 5       � ��$ Center=�6S   6d   5      5      5      o� 5   
   $
��Left=�6   $��25��6*   $��10,0,0,0q�66   $	��Top=�6H   $	��500��6`   .@�5      m� -   5        $
��Alta��5      6%   5       5!      5"      